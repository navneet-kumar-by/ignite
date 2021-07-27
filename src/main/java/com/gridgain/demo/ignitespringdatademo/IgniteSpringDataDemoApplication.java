package com.gridgain.demo.ignitespringdatademo;

import org.apache.ignite.springdata22.repository.config.EnableIgniteRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableIgniteRepositories
public class IgniteSpringDataDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IgniteSpringDataDemoApplication.class, args);
	}

}
