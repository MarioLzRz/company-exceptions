package org.ies.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.ies.model.Department;

@Data
@AllArgsConstructor
public class DepartmentNotFoundException extends Exception{
    private Department department;
}
