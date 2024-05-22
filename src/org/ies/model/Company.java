package org.ies.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.ies.exception.DepartmentNotFoundException;
import org.ies.exception.EmployeeNoFoundException;

import java.util.List;

@Data
@AllArgsConstructor
public class Company {
    private String name;
    private String cif;
    private List<Department> departments;

    public List<Employee> getEmployeesByDepartment(Department department) throws DepartmentNotFoundException {
        for (var department1 : departments){
            if (department1.equals(department)){
                return department1.getEmployees();
            }
        }
        throw new DepartmentNotFoundException();
    }

    public Department getDepartmentByName(String name) throws DepartmentNotFoundException{
        for (var department1 : departments){
            if(department1.getName().equals(name)){
                return department1;
            }
        }
        throw new DepartmentNotFoundException();
    }

    public Employee getEmployeeByNif(String nif) throws EmployeeNoFoundException{
        for (var department: departments){
            for (var employee : department.getEmployees()){
                if(employee.getNif().equals(nif)){
                    return employee;
                }
            }
        }
        throw new EmployeeNoFoundException();
    }

}
