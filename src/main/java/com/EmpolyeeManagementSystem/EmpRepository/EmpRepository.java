package com.EmpolyeeManagementSystem.EmpRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EmpolyeeManagementSystem.EmpEntity.Emp;


public interface EmpRepository  extends JpaRepository <Emp,Integer>{
	
}
