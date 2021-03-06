package com.io.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;

@Configuration
public class SecurityConfig  extends GlobalAuthenticationConfigurerAdapter {
	
	public void init(AuthenticationManagerBuilder auth)throws Exception{
		auth.inMemoryAuthentication().withUser("allen").password("pass").roles("User").and()
		.withUser("ben").password("pass").roles("USER,ADMIN");
		
	}
}
