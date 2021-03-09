/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import entities.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ckfol
 */
public class EmployeesDTO {
    private List<EmployeeDTO> employeeDTOs;

    public EmployeesDTO(List<Employee> e) {
        employeeDTOs = new ArrayList<>();
        e.forEach((eDTO) -> {
            employeeDTOs.add(new EmployeeDTO(eDTO));
        });
    }
    
}
