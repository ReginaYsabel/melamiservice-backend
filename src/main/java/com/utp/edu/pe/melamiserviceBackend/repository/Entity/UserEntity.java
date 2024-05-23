package com.utp.edu.pe.melamiserviceBackend.repository.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "")
    private Long id;

    //@Column(name = "")
    private String userName;

    //@Column(name = "")
    private String password;

    //@Column(name = "")
    private String status;

}
