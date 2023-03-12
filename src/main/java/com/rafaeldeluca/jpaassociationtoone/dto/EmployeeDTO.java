package com.rafaeldeluca.jpaassociationtoone.dto;

import com.rafaeldeluca.jpaassociationtoone.entities.Employee;

//Está classe vai ter apenas o id do Classe Department
public class EmployeeDTO {

    private Long id;
    private String name;
    private Double salary;
    private Long departmentId;

    public EmployeeDTO(Long id, String name, Double salary, Long departmentId) {
        this.id = id;
        this.name= name;
        this.salary = salary;
        this.departmentId= departmentId;
    }

    public EmployeeDTO(Employee entity) {
        id = entity.getId();
        name = entity.getName();
        salary = entity.getSalary();
        departmentId = entity.getDepartment().getId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }
}
