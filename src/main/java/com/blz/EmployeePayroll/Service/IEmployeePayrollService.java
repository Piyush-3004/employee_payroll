package com.blz.EmployeePayroll.Service;

import java.util.List;

import com.blz.EmployeePayroll.Dto.EmployeePayrollDto;
import com.blz.EmployeePayroll.Model.EmployeePayrollModel;
import com.blz.EmployeePayroll.Util.Response;

public interface IEmployeePayrollService {
	
	String start();

	EmployeePayrollModel createEmp(EmployeePayrollDto emp, Long department_id);

	Response login(String email, String pwd);

	void sendMail(long id);

	List<EmployeePayrollModel> getList();

	EmployeePayrollModel getEmpByToken(String token);

	List<EmployeePayrollModel> getByContent(String content);

	EmployeePayrollModel getEmployeeById(long id);

	EmployeePayrollModel update(long empId, long deptId);

	EmployeePayrollModel updateWithToken(String token);

	EmployeePayrollModel updateDepartmentWithToken(EmployeePayrollDto emp, String token, long deptId);

	EmployeePayrollModel delete(long id);

	EmployeePayrollModel deleteWithToken(String token);
}
