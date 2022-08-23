package br.com.siecola.aws_project02;

import br.com.siecola.aws_project02.service.ProductEventConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AwsProject02Application {


	public static void main(String[] args) {


		SpringApplication.run(AwsProject02Application.class, args);
	}

}
