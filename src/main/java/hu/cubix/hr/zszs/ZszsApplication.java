package hu.cubix.hr.zszs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import hu.cubix.hr.zszs.model.Employee;
import hu.cubix.hr.zszs.service.IEmployeeService;

@SpringBootApplication
public class ZszsApplication implements CommandLineRunner{
	
	
	@Autowired
	private IEmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(ZszsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setId(0);
		employee.setSalary(1500);
		employee.setStartWork(LocalDate.of(2010, 2, 1));
		System.out.println(employeeService.getPayRaisePercent(employee));
		
		
	}

}
