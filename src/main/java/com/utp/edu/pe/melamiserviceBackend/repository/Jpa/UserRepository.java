package com.utp.edu.pe.melamiserviceBackend.repository.Jpa;

import com.utp.edu.pe.melamiserviceBackend.repository.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {


    @Query(value = "SELECT * FROM USER WHERE USER_NAME = ?1 AND PASSWORD = ?2", nativeQuery = true)
    UserEntity findByUserName(String username, String password);


}
