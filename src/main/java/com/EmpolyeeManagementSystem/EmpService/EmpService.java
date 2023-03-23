package com.EmpolyeeManagementSystem.EmpService;

import java.util.List;

import com.EmpolyeeManagementSystem.EmpEntity.Emp;


public interface EmpService {

	public Emp insertvalue(Emp emp);
	
	public List<Emp> getempolyee();
	
	public Emp getEmpById(int id);
	  
	public Emp deleteById(int id);
	
	public Emp updateEmp(int id , Emp emp);

	

}