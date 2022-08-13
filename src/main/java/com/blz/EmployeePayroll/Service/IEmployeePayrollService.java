package com.blz.EmployeePayroll.Service;

import java.util.List;

import com.blz.EmployeePayroll.Dto.EmployeePayrollDto;
import com.blz.EmployeePayroll.Model.EmployeePayrollModel;
import com.blz.EmployeePayroll.Util.Response;

public interface IEmployeePayrollService {
	
	String start();

	EmployeePayrollModel getEmployeeById(long id);

//	EmployeePayrollModel createEmp(EmployeePayrollModel emp);

	EmployeePayrollModel update(EmployeePayrollModel emp, long id);

	EmployeePayrollModel delete(long id);

	Response login(String email, String pwd);

	List<EmployeePayrollModel> getlist();

	EmployeePayrollModel createEmp(EmployeePayrollDto emp);

	EmployeePayrollModel getempbytoken(String token);

	void sendmail(long id);



}
