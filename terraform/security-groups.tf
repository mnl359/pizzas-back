## Security group for ECS
resource "aws_security_group" "ecs-sg" {
  name          = "ecs-sg"
  description   = "Security group for ECS"
  vpc_id        = aws_vpc.pizza-application.id
  tags          = var.tags
}

resource "aws_security_group_rule" "ecs_egress" {
  type              = "egress"
  from_port         = 0
  to_port           = 0
  protocol          = "-1"
  cidr_blocks       = ["0.0.0.0/0"]
  security_group_id = aws_security_group.ecs-sg.id
}

resource "aws_security_group_rule" "ecs_ingress" {
  type                     = "ingress"
  from_port                = 0
  to_port                  = var.backend_port
  protocol                 = "tcp"
  source_security_group_id = aws_security_group.lb-sg.id
  security_group_id        = aws_security_group.ecs-sg.id
}

## Security group for load balancer
resource "aws_security_group" "lb-sg" {
  name          = "lb-sg"
  description   = "Security group for Application Load Balancer"
  vpc_id        = aws_vpc.pizza-application.id
  tags          = var.tags
}

resource "aws_security_group_rule" "lb_egress" {
  type              = "egress"
  from_port         = 0
  to_port           = 0
  protocol          = "-1"
  cidr_blocks       = ["0.0.0.0/0"]
  security_group_id = aws_security_group.lb-sg.id
}

resource "aws_security_group_rule" "lb_ingress" {
  type                     = "ingress"
  from_port                = 0
  to_port                  = var.backend_port
  protocol                 = "tcp"
  cidr_blocks              = ["0.0.0.0/0"]
  security_group_id        = aws_security_group.lb-sg.id
}

## Security group for RDS
resource "aws_security_group" "rds-sg" {
  name          = "rds-sg"
  description   = "Security group for RDS"
  vpc_id        = aws_vpc.pizza-application.id
  tags          = var.tags
}

resource "aws_security_group_rule" "rds_egress" {
  type              = "egress"
  from_port         = 0
  to_port           = 0
  protocol          = "-1"
  cidr_blocks       = ["0.0.0.0/0"]
  security_group_id = aws_security_group.rds-sg.id
}

resource "aws_security_group_rule" "rds_ingress" {
  type                     = "ingress"
  from_port                = 0
  to_port                  = var.backend_port
  protocol                 = "tcp"
  source_security_group_id = aws_security_group.ecs-sg.id
  security_group_id        = aws_security_group.rds-sg.id
}