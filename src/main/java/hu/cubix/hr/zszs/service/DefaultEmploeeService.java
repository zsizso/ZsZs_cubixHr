package hu.cubix.hr.zszs.service;

import hu.cubix.hr.zszs.model.Employee;

public class DefaultEmploeeService implements IEmployeeService {

	@Override
	public int getPayRaisePercent(Employee employee) {
		return 5;
		
	}

}
