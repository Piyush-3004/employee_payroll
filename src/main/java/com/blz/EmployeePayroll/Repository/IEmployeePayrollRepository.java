package com.blz.EmployeePayroll.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blz.EmployeePayroll.Model.EmployeePayrollModel;

public interface IEmployeePayrollRepository extends JpaRepository<EmployeePayrollModel, Long>{

}
