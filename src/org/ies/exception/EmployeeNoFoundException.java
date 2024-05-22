package org.ies.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.ies.model.Employee;

@Data
@AllArgsConstructor
public class EmployeeNoFoundException extends Exception{
}
