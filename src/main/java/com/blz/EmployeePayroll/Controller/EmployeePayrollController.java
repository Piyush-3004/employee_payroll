package com.blz.EmployeePayroll.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blz.EmployeePayroll.Service.IEmployeePayrollService;

public class EmployeePayrollController {

	@Autowired
	IEmployeePayrollService employeePayrollService;

	@RequestMapping("")
	public String start() {
		return employeePayrollService.start();
	}
		
}