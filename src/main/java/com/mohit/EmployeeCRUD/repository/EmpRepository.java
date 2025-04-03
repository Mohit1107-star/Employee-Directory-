package com.mohit.EmployeeCRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import com.mohit.EmployeeCRUD.entity.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee , Integer> {
    public Optional<Employee> findByEname(String ename);
    List<Employee> findByEnameContainingIgnoreCase(String ename);
}
