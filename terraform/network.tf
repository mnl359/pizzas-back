# VPC
resource "aws_vpc" "pizza-application" {
  cidr_block           = var.IP_VPC
  tags                 = var.tags
}

## Internet Gateway
resource "aws_internet_gateway" "pizza-application-gw" {
  vpc_id = aws_vpc.pizza-application.id
  tags   = var.tags
}

## Subnets for high availability
resource "aws_subnet" "pizza-application-sub1" {
  vpc_id            = aws_vpc.pizza-application.id
  cidr_block        = var.IP_paSUB1
  availability_zone = var.region_paSUB1
  tags              = var.tags
}

resource "aws_subnet" "pizza-application-sub2" {
  vpc_id            = aws_vpc.pizza-application.id
  cidr_block        = var.IP_paSUB2
  availability_zone = var.region_paSUB2
  tags              = var.tags
}

## Subnet group for RDS creation
resource "aws_db_subnet_group" "pizza-application-sg" {
  name       = "pizza-application-sg"
  subnet_ids = [aws_subnet.pizza-application-sub1.id,aws_subnet.pizza-application-sub2.id]
  tags       = var.tags
}

## Route table
resource "aws_route_table" "PA-rt" {
  vpc_id       = aws_vpc.pizza-application.id
  tags         = var.tags
  route {
        cidr_block = "0.0.0.0/0"
        gateway_id = aws_internet_gateway.pizza-application-gw.id
    }
}

resource "aws_route_table_association" "sub1-rtAssociation" {
  subnet_id      = aws_subnet.pizza-application-sub1.id
  route_table_id = aws_route_table.PA-rt.id
}

resource "aws_route_table_association" "sub2-rtAssociation" {
  subnet_id      = aws_subnet.pizza-application-sub2.id
  route_table_id = aws_route_table.PA-rt.id
}