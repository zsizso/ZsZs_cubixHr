package hu.cubix.hr.zszs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import hu.cubix.hr.zszs.service.DefaultEmploeeService;
import hu.cubix.hr.zszs.service.IEmployeeService;

@Configuration
@Profile("!smart")
public class DefaultConfig {
	
	@Bean
	public IEmployeeService defaultService() {
		return new DefaultEmploeeService();
	}

}
