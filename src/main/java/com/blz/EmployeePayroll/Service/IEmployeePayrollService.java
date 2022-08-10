package com.blz.EmployeePayroll.Service;

import com.blz.EmployeePayroll.Model.EmployeePayrollModel;

public interface IEmployeePayrollService {
	
	String start();

	EmployeePayrollModel getEmployeeById(long id);

	EmployeePayrollModel createEmp(EmployeePayrollModel emp);

	EmployeePayrollModel update(EmployeePayrollModel emp, long id);

	EmployeePayrollModel delete(long id);

}
