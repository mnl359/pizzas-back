## MySQL DB instance
resource "aws_db_instance" "pizzappdb" {
  name                   = var.database_name
  identifier             = var.db_identifier

  engine                 = var.db_engine
  engine_version         = var.db_engine_version
  instance_class         = var.db_ami

  allocated_storage      = var.db_storage
  storage_type           = "gp2"

  vpc_security_group_ids = [aws_security_group.rds-sg.id]
  db_subnet_group_name   = aws_db_subnet_group.pizza-application-sg.id
  port                   = var.db_port
  skip_final_snapshot    = true
  
  username               = var.db_user
  password               = var.db_password
  tags                   = var.tags

  enabled_cloudwatch_logs_exports = ["audit", "error", "general", "slowquery"]
}