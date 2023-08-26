package io.javabrains;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableCaching
public class CourseApiDataApplication {

	public static void main(String[] args) {
		//args = new String[] {"--spring.config.location=file:c:/properties/application.properties"};
		SpringApplication.run(CourseApiDataApplication.class, args);
	}

}
