## ECS Cluster
resource "aws_ecs_cluster" "backend-pizza" {
  name = var.ecs_cluster-name
  setting {
      name  ="containerInsights"
      value = "enabled"
    }
   tags = var.tags
}

# Log group for ECS
resource "aws_cloudwatch_log_group" "backend-pizza" {
  name = "/ecs/backend-pizza"
}

## Task definition
resource "aws_ecs_task_definition" "backend-pizza" {
    family                = "backend-pizza"
    container_definitions = data.template_file.ecs-task-definition.rendered
}

data "template_file" "ecs-task-definition" {
    template = file("${path.module}/templates/task-definition.json")
    vars = {
        cluster-name = aws_ecs_cluster.backend-pizza.name
        docker-img   = var.docker-image
        database     = var.database_name
        db-host      = aws_db_instance.pizzappdb.address
        db-password  = aws_db_instance.pizzappdb.password
        db-user      = aws_db_instance.pizzappdb.username
        db-port      = var.db_port
        region       = var.aws_region
    }
}

## Service
resource "aws_ecs_service" "backend-pizza-service" {
  	name            = var.ecs-service-name
  	iam_role        = aws_iam_role.ecs-service-role.arn
  	cluster         = aws_ecs_cluster.backend-pizza.id
  	task_definition = aws_ecs_task_definition.backend-pizza.arn
  	desired_count   = var.asg_desired

  	load_balancer {
    	target_group_arn  = aws_alb_target_group.ecs-target_group.arn
    	container_port    = 8080
    	container_name    = var.ecs-service-name
	  }
    depends_on = [aws_iam_role.ecs-service-role]
}