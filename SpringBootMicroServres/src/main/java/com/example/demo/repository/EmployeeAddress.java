
package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeAddress extends JpaRepository<com.model.address.empmodel.EmployeeAddress, Long> {

}
