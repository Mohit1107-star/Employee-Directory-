package com.mohit.EmployeeCRUD.controller;

import com.mohit.EmployeeCRUD.dto.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.mohit.EmployeeCRUD.entity.Employee;
import com.mohit.EmployeeCRUD.service.EmpService;

import java.util.List;

@RestController
@RequestMapping("/api/emp")
public class EmpController {
    private final EmpService service;

    @Autowired
    public EmpController(EmpService empService) {
        this.service = empService;
    }

    @PostMapping("/add")
    public ResponseEntity<String> addEmp(@RequestBody EmployeeDTO empDTO) {
        return ResponseEntity.ok(service.addEmp(empDTO));
    }

    @GetMapping("/{empId}")
    public Employee getEmp(@PathVariable("empId")Integer empId) {
        return service.getEmp(empId);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Employee>> searchEmployees(@RequestParam String name) {
        List<Employee> employees = service.searchEmpByName(name);
        return ResponseEntity.ok(employees);
    }

    @PutMapping("/update/{empId}")
    public ResponseEntity<String> updateEmp(@RequestBody EmployeeDTO updatedEmp, @PathVariable Integer empId) {
        return ResponseEntity.ok(service.updateEmp(updatedEmp, empId));
    }

    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<String> deleteEmp(@PathVariable Integer empId) {
        return ResponseEntity.ok(service.deleteEmp(empId));
    }
}
