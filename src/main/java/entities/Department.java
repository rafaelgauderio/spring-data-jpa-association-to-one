package entities;



import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long name;

    @OneToMany(mappedBy = "department")
    private List<Employee> emplloyees = new ArrayList<Employee>();

    public Department() {

    }
    public Department(Long id, Long name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getName() {
        return name;
    }

    public void setName(Long name) {
        this.name = name;
    }

    public List<Employee> getEmplloyees() {
        return emplloyees;
    }

    /*
    public void setEmplloyees(List<Employee> emplloyees) {
        this.emplloyees = emplloyees;

     */

}
