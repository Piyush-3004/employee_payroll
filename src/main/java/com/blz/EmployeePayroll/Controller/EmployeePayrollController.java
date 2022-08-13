package com.blz.EmployeePayroll.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.blz.EmployeePayroll.Dto.EmployeePayrollDto;
import com.blz.EmployeePayroll.Model.EmployeePayrollModel;
import com.blz.EmployeePayroll.Service.IEmployeePayrollService;
import com.blz.EmployeePayroll.Util.Response;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

	@Autowired
	private IEmployeePayrollService employeePayrollService;

	@GetMapping("/getlist")
	public List<EmployeePayrollModel> getlist() {
		return employeePayrollService.getlist();
	}
	
	@PostMapping("/login")
	public Response login(@RequestParam String email,@RequestParam String pwd) {
		return employeePayrollService.login(email,pwd);
	}

	@GetMapping("/getempbytoken")
	public EmployeePayrollModel getempbytoken(@RequestHeader String token){
		return employeePayrollService.getempbytoken(token);
	}

	@GetMapping("/getempwithid/{id}")
	public EmployeePayrollModel getEmployee(@PathVariable long id) {
		return employeePayrollService.getEmployeeById(id);
	}
	
	@GetMapping("/sendmail/{id}")
	public void sendmail(@PathVariable long id) {
		employeePayrollService.sendmail(id);

	}
	
	@PostMapping("/create")
	public EmployeePayrollModel create(@RequestBody EmployeePayrollDto emp) {
		return employeePayrollService.createEmp(emp);
	}

	@PutMapping("/update/{id}")
	public EmployeePayrollModel update(@RequestBody EmployeePayrollModel emp, @PathVariable long id) {
		return employeePayrollService.update(emp, id);

	}
	
	@DeleteMapping("/delete/{id}")
	public EmployeePayrollModel delete(@PathVariable long id) {
		return employeePayrollService.delete(id);

	}
	


}
