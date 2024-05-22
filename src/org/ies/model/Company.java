package org.ies.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.ies.exception.DepartmentNotFoundException;

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
        throw new DepartmentNotFoundException(department);
    }

    public Department getDepartmentByName(String name) throws DepartmentNotFoundException{
        if (var department1 : departments){

        }
    }

}
