terraform { 
    backend "s3" {
        bucket          = "terraform-pizzas-application"
        key             = "terraform-pizzas-application-back/state"
        region          = "us-east-2"
        dynamodb_table  = "terraform-pizzas-application"
        encrypt         = true
    }
}
