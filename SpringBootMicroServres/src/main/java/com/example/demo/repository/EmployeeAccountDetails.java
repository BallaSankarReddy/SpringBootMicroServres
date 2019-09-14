
  package com.example.demo.repository;
  
  import org.springframework.data.jpa.repository.JpaRepository;
import
  org.springframework.stereotype.Repository;

import com.model.address.empmodel.EmployeeeAccountDetails;
  
  @Repository public interface EmployeeAccountDetails extends
  JpaRepository<EmployeeeAccountDetails, Long>{
  
  }
 