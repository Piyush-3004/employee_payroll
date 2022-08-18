package com.blz.EmployeePayroll.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blz.EmployeePayroll.Dto.DepartmentDto;
import com.blz.EmployeePayroll.Exception.EmployeeNotFoundException;
import com.blz.EmployeePayroll.Model.Department;
import com.blz.EmployeePayroll.Model.EmployeePayrollModel;
import com.blz.EmployeePayroll.Repository.IDepartmentRepository;
import com.blz.EmployeePayroll.Repository.IEmployeePayrollRepository;
import com.blz.EmployeePayroll.Util.TokenUtil;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService implements IDepartmentService{

    @Autowired
    IDepartmentRepository departmentRepo;
    
    @Autowired
    IEmployeePayrollRepository empRepo;
    
	@Autowired
	TokenUtil tokenUtil;
	
	
	 @Override
	    public Department addDepartment(DepartmentDto departmentDto) {
	        Department department=new Department();
	        department.setDepartmentName(departmentDto.getDepartmentName());
	        department.setDepartmentDescription(departmentDto.getDepartmentDesc());
//	        department.setCreatedTimeStamp(LocalDateTime.now());
	        departmentRepo.save(department);
	        return department;
	    }

	 @Override
	 public Department getDepartmentByToken(String token) {
		 long id = tokenUtil.decodeToken(token);
		 Optional<EmployeePayrollModel> isEmpPresent = empRepo.findById(id);
		 if(isEmpPresent.isPresent()) {
			 return isEmpPresent.get().getDepartment();
		 }
		 throw new EmployeeNotFoundException(100,"no data");
	 }
	 
	 @Override
	 public List<Department> getDepartments() {
		 List<Department> list = departmentRepo.findAll();
		 if(!list.isEmpty())
			 return list;
		 log.info("No Department Present");
		 return null;
	 }

	 public Department update(String token, DepartmentDto DepartmentDto) {
		 long userId = tokenUtil.decodeToken(token);
		 Optional<EmployeePayrollModel> isEmpPresent = empRepo.findById(userId);
		 if(isEmpPresent.isPresent()) {
			 Optional<Department> isDeptPresent = empRepo.findByDepartment(isEmpPresent.get().getDepartment());			
			 isDeptPresent.get().setDepartmentName(DepartmentDto.getDepartmentName());
			 isDeptPresent.get().setDepartmentDescription(DepartmentDto.getDepartmentDesc());
			 departmentRepo.save(isDeptPresent.get());
			 return isDeptPresent.get();
		 }
		 return null;
	 }

}
