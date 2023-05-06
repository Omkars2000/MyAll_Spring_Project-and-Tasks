package org.jspider.employeeapi.services;

import org.jspider.employeeapi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServices {

    List<Employee> employeeList = new ArrayList<>();

    {
        employeeList.add(new Employee(101, "OMKAR", "TECH LEACD", 12000000.25));
        employeeList.add(new Employee(102, "SHAFIK", "TECH LEACD", 12000000.25));
        employeeList.add(new Employee(103, "SWAPNIL", "TECH LEACD", 12000000.25));
        employeeList.add(new Employee(104, "OMKAR", "TECH LEACD", 12000000.25));

    }

    public List<Employee> getAllEmployee() {
        return employeeList;
    }

    public Employee getEmployeeById(int id) {
        Employee e1 = null;
        e1=employeeList.get(getID(id));
        return e1;
    }

    public void addEmployee(Employee e) {
        employeeList.add(e);
    }

    public void updateEmployee(int id, Employee e) {
//        Employee emp = employeeList.get(getID(id));
        employeeList.set(getID(id), e);
    }

    public void deleteEmployee(int empId1) {
        employeeList.remove(getID(empId1));

    }

    public int getID(int empId) {
        for (int i = 0; i < employeeList.size(); i++) {
            Employee e1 = employeeList.get(i);
            int empid = e1.getEmployeeId();
            if (empid == empId) {
                return i;
            }
        }
        return -1;
    }
}
