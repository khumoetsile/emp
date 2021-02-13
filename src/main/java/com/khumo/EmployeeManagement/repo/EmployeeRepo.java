package com.khumo.EmployeeManagement.repo;

import com.khumo.EmployeeManagement.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);
    //Make it Optional so that if you pass random employee id and there is no employee by that ID
    //## Normally it can be like below ##
    //Employee findEmployeeById(Long id);
    Optional<Employee> findEmployeeById(Long id);
}
