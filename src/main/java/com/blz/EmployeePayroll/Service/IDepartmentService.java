package com.blz.EmployeePayroll.Service;

import java.util.List;

import com.blz.EmployeePayroll.Dto.DepartmentDto;
import com.blz.EmployeePayroll.Model.Department;

public interface IDepartmentService {
	Department addDepartment(DepartmentDto departmentDTO);

	Department getDepartmentByToken(String token);

	List<Department> getDepartments();
}
