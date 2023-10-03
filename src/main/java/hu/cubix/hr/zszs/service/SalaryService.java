package hu.cubix.hr.zszs.service;

import org.springframework.stereotype.Service;

import hu.cubix.hr.zszs.model.Employee;

@Service
public class SalaryService {
	
	private IEmployeeService employeeService;

	public SalaryService(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	public int getFinalSalary(Employee employee) {
		return (int) employeeService.getPayRaisePercent(employee);
		
	}
	

}
