package com.Phenix13.msaccounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableFeignClients
@RefreshScope
// @ComponentScans({ @ComponentScan("com.Phenix13.msaccounts.controller")})
@EnableJpaRepositories("com.Phenix13.msaccounts.repository")
@EntityScan("com.Phenix13.msaccounts.model")
public class accountApplication {

	public static void main(String[] args) {
		SpringApplication.run(accountApplication.class, args);
	}

}
