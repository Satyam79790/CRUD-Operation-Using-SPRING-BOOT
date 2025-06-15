package com.project1.springproject1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service

public class EmployeeServiceImpl implements EmployeeService{
   @Autowired
   private EmployeeRepository employeerepository;


    @Override
    public String createEmployee(Employee employee) {

      EmployEntity employentity = new EmployEntity();
      BeanUtils.copyProperties(employee,employentity);
      employeerepository.save(employentity);
      // employees.add(employee);
       return "Saved Sucessfully";
    }
    @Override
    public Employee readEmployee(long id) {
    EmployEntity employentity = employeerepository.findById(id).get();
      Employee employee = new Employee();
      BeanUtils.copyProperties(employentity,employee);
      return employee;
    }

    @Override
    public List<Employee> readEmployees() {

      List<EmployEntity> employeesList = employeerepository.findAll();
       List<Employee> employees = new ArrayList<>();
       for (EmployEntity employentity : employeesList){
         Employee emp = new Employee();
         emp.setId(employentity.getId());
         emp.setName(employentity.getName());
         emp.setPhone(employentity.getPhone());
         emp.setEmail(employentity.getEmail());
         employees.add(emp);
       } 
         
      return employees;
    }

    @Override
   public boolean deleteEmployee(long id) {
      EmployEntity emp = employeerepository.findById(id).get();
      employeerepository.delete(emp);
            return true;
        }

    @Override
    public String updateEmployee(long id, Employee employee) {
      EmployEntity exestingEmployee = employeerepository.findById(id).get();
      //exestingEmployee.setId(employee.getId());
      exestingEmployee.setName(employee.getName());
      exestingEmployee.setPhone(employee.getPhone());
      exestingEmployee.setEmail(employee.getEmail());
      employeerepository.save(exestingEmployee);
    return "update successfully";
    }

    
       }

    
    




