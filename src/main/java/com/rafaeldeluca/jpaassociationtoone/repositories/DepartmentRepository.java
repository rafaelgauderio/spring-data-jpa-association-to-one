package com.rafaeldeluca.jpaassociationtoone.repositories;

import com.rafaeldeluca.jpaassociationtoone.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository  extends JpaRepository <Department, Long> {
}
