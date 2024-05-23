package com.utp.edu.pe.melamiserviceBackend.repository.Jpa;

import com.utp.edu.pe.melamiserviceBackend.repository.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {

}
