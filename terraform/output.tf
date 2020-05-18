output "API_Backend_url" {
  value = aws_alb.ecs-load-balancer.dns_name
}

output "bd_endpoint" {
  value = aws_db_instance.pizzappdb.address
}