package com.EmpolyeeManagementSystem.EmpRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.EmpolyeeManagementSystem.EmpEntity.Emp;

@Repository
public interface EmpRepository  extends JpaRepository <Emp,Integer>{
	
}
