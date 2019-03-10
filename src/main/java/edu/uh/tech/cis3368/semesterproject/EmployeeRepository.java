package edu.uh.tech.cis3368.semesterproject;

import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {


    public ArrayList<Employee> findEmployeeByEmail(String email);
}
