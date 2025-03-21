package EmployeeDetails;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement {

    public static void main(String[] args){
        Employee emp1=new Employee(101, "diksha", 500000);
        Employee emp2=new Employee(102, "shyam", 800000);
        Employee emp3=new Employee(103, "ram", 68000);

        List<Employee> employees=new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        System.out.println("Employee Details: ");
        for (Employee emp:employees){
            emp.displayDetails();
        }

    }
}
