/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import entities.Department;
import entities.Employee;
import entities.Project;
import java.util.List;

/**
 *
 * @author ckfol
 */
public class EmployeeDTO {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private List<Project> projectList;
    private Department departmencode;

    public EmployeeDTO(Employee employee) {
        this.id = employee.getId();
        this.firstName = employee.getFirstName();
        this.lastName = employee.getLastName();
        this.email = employee.getEmail();
        this.projectList = employee.getProjectList();
        this.departmencode = employee.getDepartmentcode();
    }

    
    
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(List<Project> projectList) {
        this.projectList = projectList;
    }

    public Department getDepartmencode() {
        return departmencode;
    }

    public void setDepartmencode(Department departmencode) {
        this.departmencode = departmencode;
    }
    
}
