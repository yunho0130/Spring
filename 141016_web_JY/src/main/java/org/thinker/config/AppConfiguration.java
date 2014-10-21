package org.thinker.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import a1.HelloWorld;
import a1.Korean;

@Configuration
public class AppConfiguration {
		
		@Bean
		public HelloWorld getsayHello(){
			
			return new Korean();
		}
		
	
}
