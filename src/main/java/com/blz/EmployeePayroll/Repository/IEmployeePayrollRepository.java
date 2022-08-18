package com.blz.EmployeePayroll.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blz.EmployeePayroll.Model.Department;
import com.blz.EmployeePayroll.Model.EmployeePayrollModel;

public interface IEmployeePayrollRepository extends JpaRepository<EmployeePayrollModel, Long>{

	Optional<EmployeePayrollModel> findByEmailId(String emailId);

	Optional<Department> findByDepartment(Department department);

}
