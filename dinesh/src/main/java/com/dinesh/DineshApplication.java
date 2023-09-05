package com.dinesh;

import com.dinesh.security.JwtAuthenticationEntryPoint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DineshApplication {

	public static void main(String[] args) {
		SpringApplication.run(DineshApplication.class, args);
	}


//	@Bean
//	public JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint(){
//		return new JwtAuthenticationEntryPoint();
//	}

}
