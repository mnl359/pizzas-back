variable "profile" {
  description = "Profile for Terraform"
  type        = string
  default     = "personal"
}

variable "aws_region" {
  description = "Principal region: Ohio"
  type        = string
  default     = "us-east-2"
}


variable "tags" {
  description = "Description tags for resources"
  type        = map(string)
  default     = {"owner":"manuela.carrasco", 
                 "project":"Rampup2020",
                 "provisioner":"Terraform"}
}

## Network variables
# VPC
variable "IP_VPC" {
  description = "Global IP for pizza application"
  type        = string
  default     = "172.30.0.0/16"
}

variable "IP_paSUB1" {
  description = "IP for subnet availability zone 1"
  type        = string
  default     = "172.30.1.0/24"
}

variable "region_paSUB1" {
  description = "Region for subnet availability zone 1"
  type        = string
  default     = "us-east-2a"
}

variable "IP_paSUB2" {
  description = "IP for subnet availability zone 2"
  type        = string
  default     = "172.30.2.0/24"
}

variable "region_paSUB2" {
  description = "Region for subnet availability zone 2"
  type        = string
  default     = "us-east-2b"
}

## ECS
variable "backend_port" {
  description = "Port to connect to the backend"
  type        = string
  default     = "8080"
}

variable "ecs_cluster-name" {
  description = "Cluster name"
  type        = string
  default     = "backend-pizza"
}

## Autoscaling group variables
variable "asg_max-instances" {
  description = "Maximum running instances in group"
  type        = string
  default     = "2"
}

variable "asg_min-instances" {
  description = "Manimum running instances in group"
  type        = string
  default     = "1"
}

variable "asg_desired" {
  description = "Desired running instances in group"
  type        = string
  default     = "2"
}

variable "ec2_amiid" {
  description = "The EC2 image ID to launch"
  type        = string
  default     = "ami-0d9ef3d936a8fa1c6"
}

variable "ec2_type" {
  description = "Instance type"
  type        = string
  default     = "t2.micro"
}

variable "docker-image" {
  description = "Docker image for instances"
  type        = string
  default     = "mcarras1/pizza-backend:1.0"
}

# ECS service
variable "ecs-service-name" {
  description = "ECS service name"
  type        = string
  default     = "backend-pizza"
}

## Database variables

variable "db_user" {
  description = "User for the database"
}

variable "db_password" {
  description = "Password for database user"
}

variable "database_name" {
  description = "Database used by Pizza Application"
  type        = string
  default     = "pizzadb"
}

variable "db_identifier" {
  description = "Database hostname for endpoint"
  type        = string
  default     = "pizzasdb"
}

variable "db_engine" {
  description = "Database engine for pizza application"
  type        = string
  default     = "mysql"
}

variable "db_engine_version" {
  description = "Database engine version for pizza application"
  type        = string
  default     = "5.7"
}

variable "db_ami" {
  description = "Amazon machine image for database instance"
  type        = string
  default    = "db.t2.micro"
}

variable "db_storage" {
  description = "Database allocated storage"
  type        = number
  default    = 20
}

variable "db_port" {
  description = "Database connection port"
  type        = number
  default    = 3306
}