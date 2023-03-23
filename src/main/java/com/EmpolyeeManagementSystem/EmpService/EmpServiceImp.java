package com.EmpolyeeManagementSystem.EmpService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmpolyeeManagementSystem.EmpEntity.Emp;
import com.EmpolyeeManagementSystem.EmpRepository.EmpRepository;

@Service
public class EmpServiceImp implements EmpService {

	@Autowired
	private EmpRepository ud;
	
	@Override
	public Emp insertvalue(Emp emp) {
		
		return ud.save(emp);
	}

	public List<Emp> getempolyee() {

		return ud.findAll();
	}
	
	@Override
	public Emp getEmpById(int id) {
		
	return ud.findById(id).get();
	}

	@Override
	public Emp deleteById(int id) {
		
    Emp emp = ud.findById(id).get();
		
	    if(emp != null)
	    {
		  ud.delete(emp);
	    }
		return null; 
	}

	@Override
	public Emp updateEmp(int id, Emp emp) {
		
		Emp oldemp = ud.findById(id).get();
		 
		if(oldemp!= null)
		{
			emp.setId(id);
			return ud.save(emp); 
		}
		  
		  return null;
	}
}
