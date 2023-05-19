package com.streams.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.stream.Collectors;

@RestController
public class StreamsController {

    @GetMapping("/emp")
    public List<Employee> getEmployeeList(){
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(111, "Naruto", 32, "Female", "HR", 2020, 25000.0));
        employeeList.add(new Employee(122, "Jiraya", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Itchi", 29, "Male", "Infrastructure", 2019, 18000.0));
        employeeList.add(new Employee(177, "Kakashi", 35, "Male", "Account And Finance", 2017, 27000.0));
        employeeList.add(new Employee(188, "Obito", 31, "Male", "Product Development", 2019, 34500.0));

        employeeList.stream()
                .map(Employee::getSalary)
                .distinct()
                .forEach(System.out::println);

        return employeeList;
    }
}
