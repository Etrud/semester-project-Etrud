package edu.uh.tech.cis3368.semesterproject;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;


@Component
public class MainController {

    private EmployeeRepository employeeRepository;

    public void deleteEmployee(String email){

        ArrayList<Employee> employeeArrayList = employeeRepository.findEmployeeByEmail(email);
        employeeArrayList.forEach(employeeRepository::delete);
    }

    public void addEmployee(String first,String last,String email,String phone)
    {
         employeeRepository.hashCode();
         Employee employee = new Employee();
         employee.setLastName(last);
         employee.setFirstName(first);
         employee.setEmail(email);
         employee.setPhone(phone);
         employeeRepository.save(employee);
    }

    public void changeEmployee() {}
}
