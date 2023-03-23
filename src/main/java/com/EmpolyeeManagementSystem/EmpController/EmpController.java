package com.EmpolyeeManagementSystem.EmpController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.EmpolyeeManagementSystem.EmpEntity.Emp;
import com.EmpolyeeManagementSystem.EmpService.EmpService;



@CrossOrigin (origins = "http://localhost:3000")
@RestController
public class EmpController {

	@Autowired
	EmpService us;
	
	@PostMapping("/insert")
	public Emp insertvalue(@RequestBody Emp emp)
	{
		return us.insertvalue(emp);
	}
	
	@GetMapping("/getlist")
	public List<Emp> getempolyee()
	{
		return us.getempolyee(); 
	}
	
	@GetMapping("/{id}") 
	public Emp getEmpById(@PathVariable String id)
	{
		return us.getEmpById(Integer.parseInt(id));
	}
	
	
	
	@DeleteMapping("/delete/{id}")
	public Emp deleteById(@PathVariable int id)
	{
		return us.deleteById(id);	
		
	}
	
	@PostMapping("/update/{id}")
	public Emp updateEmp(@PathVariable int id, @RequestBody Emp emp)
	{
		return us.updateEmp(id, emp);
		
	}
		
}