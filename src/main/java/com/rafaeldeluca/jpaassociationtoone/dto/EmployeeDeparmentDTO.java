package com.rafaeldeluca.jpaassociationtoone.dto;

import com.rafaeldeluca.jpaassociationtoone.entities.Department;
import com.rafaeldeluca.jpaassociationtoone.entities.Employee;

// Essa classe vai ter uma entidade DeparmentDTO completa no relacionamento com a classe Employee
// não apenas o DepartmentId
public class EmployeeDeparmentDTO {

    private Long id;
    private String name;
    private Double salary;
    private DepartmentDTO departmentDTO;

    public EmployeeDeparmentDTO(Long id, String name, Double salary, DepartmentDTO departmentDTO) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.departmentDTO = departmentDTO;
    }

    public EmployeeDeparmentDTO(Employee entity) {
        id = entity.getId();
        name = entity.getName();
        salary = entity.getSalary();
        departmentDTO = new DepartmentDTO(entity.getDepartment());
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

    public DepartmentDTO getDepartmentDTO() {
        return departmentDTO;
    }

    public void setDepartmentDTO(DepartmentDTO departmentDTO) {
        this.departmentDTO = departmentDTO;
    }
}
