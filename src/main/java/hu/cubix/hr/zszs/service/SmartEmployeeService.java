package hu.cubix.hr.zszs.service;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.beans.factory.annotation.Autowired;

import hu.cubix.hr.zszs.config.HrConfigProperties;
import hu.cubix.hr.zszs.config.HrConfigProperties.PayRaise.Smart;
import hu.cubix.hr.zszs.model.Employee;

public class SmartEmployeeService implements IEmployeeService {
	
	@Autowired
	HrConfigProperties configProperties;

	@Override
	public int getPayRaisePercent(Employee employee) {
		
		Smart smart = configProperties.getPayRaise().getSmart();
		Period period = Period.between(employee.getStartWork(),LocalDate.now());
		int monthsNo = (int) period.getYears()*12 + period.getMonths();

		
		if(monthsNo >= (int)smart.getHighWorkYears() * 12) {
			return smart.getHighPercent();
		}
		if(monthsNo >= (int)smart.getMiddleWorkYears() * 12 && monthsNo < (int)smart.getHighPercent() * 12) {
			return smart.getMiddlePercent();
		}
		
		if(monthsNo >= (int)smart.getLowWorkYears() * 12 && monthsNo < (int)smart.getMiddleWorkYears() * 12) {
			return smart.getLowPercent();
		}
		
		return 0;
	}

}
