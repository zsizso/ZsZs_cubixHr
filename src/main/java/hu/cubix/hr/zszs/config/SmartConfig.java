package hu.cubix.hr.zszs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import hu.cubix.hr.zszs.service.IEmployeeService;
import hu.cubix.hr.zszs.service.SmartEmployeeService;

@Configuration
@Profile("smart")
public class SmartConfig {
	
	@Bean
	public IEmployeeService smartService() {
		return new SmartEmployeeService();
	}

}
