package com.project1.springproject1;

import java.util.List;

public interface EmployeeService {
String createEmployee(Employee employee);
 List<Employee> readEmployees();
  boolean deleteEmployee(long id);
  String updateEmployee(long id , Employee employee);
  Employee readEmployee(long id);
}



