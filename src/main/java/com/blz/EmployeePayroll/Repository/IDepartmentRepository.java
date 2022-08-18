package com.blz.EmployeePayroll.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blz.EmployeePayroll.Model.Department;

public interface IDepartmentRepository extends JpaRepository<Department,Long>{

}
