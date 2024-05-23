package com.utp.edu.pe.melamiserviceBackend.repository.Jpa;

import com.utp.edu.pe.melamiserviceBackend.repository.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {
}
