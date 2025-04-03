package com.mohit.EmployeeCRUD.service;

import com.mohit.EmployeeCRUD.dto.EmployeeDTO;
import com.mohit.EmployeeCRUD.entity.Employee;
import com.mohit.EmployeeCRUD.exception.EmpAlreadyExistsException;
import com.mohit.EmployeeCRUD.exception.NoSuchEmpExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mohit.EmployeeCRUD.repository.EmpRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmpService     {
    private EmpRepository empRepo;

    @Autowired
    public EmpService(EmpRepository empRepo) {
        this.empRepo=empRepo;
    }

    //POST
    public String addEmp(EmployeeDTO empDTO) {
        if (empRepo.findByEname(empDTO.getEname()).isPresent()) {
            throw new EmpAlreadyExistsException("Emp with name " + empDTO.getEname() + " already exists");
        }
        Employee emp = new Employee();
        emp.setEname(empDTO.getEname());
        emp.setSal(empDTO.getSal());
        empRepo.save(emp);
        return "Emp saved successfully!";
    }

    //GET
    public Employee getEmp(Integer empId) {
        Employee e=empRepo.findById(empId).orElse(null);
        if(e==null) {
            throw new NoSuchEmpExistsException("Emp with id "+empId+" does not exist");
        }
        return e;
    }

    //PUT
    public String updateEmp(EmployeeDTO empDTO, Integer empId) {
        Employee emp = empRepo.findById(empId).orElseThrow(
                () -> new NoSuchEmpExistsException("Emp with id " + empId + " does not exist")
        );
        emp.setEname(empDTO.getEname());
        emp.setSal(empDTO.getSal());
        empRepo.save(emp);
        return "Emp updated successfully!";
    }

    //DELETE
    public String deleteEmp(Integer empId) {
        Employee emp = empRepo.findById(empId).orElseThrow(
                () -> new NoSuchEmpExistsException("Emp with id " + empId + " does not exist")
        );

        empRepo.delete(emp);
        return "Emp deleted successfully!";
    }

    //Search
    public List<Employee> searchEmpByName(String name) {
        return empRepo.findByEnameContainingIgnoreCase(name);
    }

}
