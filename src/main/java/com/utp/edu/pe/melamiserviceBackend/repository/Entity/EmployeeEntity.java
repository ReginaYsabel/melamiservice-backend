package com.utp.edu.pe.melamiserviceBackend.repository.Entity;

import com.utp.edu.pe.melamiserviceBackend.repository.Jpa.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "")
    private Long id;

    //@Column(name = "")
    private String firstName;

    //@Column(name = "")
    private String lastName;

    //@Column(name = "")
    private String jobPosition;

    //@Column(name = "")
    private String dni;

    //@Column(name = "")
    private String email;

    //@Column(name = "")
    private String birthDate;

    //@Column(name = "")
    private String telephone;
}
