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

	EmployeePayrollModel getEmployeeById(long id);

	EmployeePayrollModel getEmpByToken(String token);

	List<EmployeePayrollModel> getByContent(String content);

	EmployeePayrollModel setDepartment(long empId, long deptId);

	EmployeePayrollModel updateWithToken(EmployeePayrollDto employeePayrollDto, String token);

	EmployeePayrollModel setDepartmentToToken(String token, long deptId);

	EmployeePayrollModel delete(long id);
	
	EmployeePayrollModel deleteWithToken(String token);
}
