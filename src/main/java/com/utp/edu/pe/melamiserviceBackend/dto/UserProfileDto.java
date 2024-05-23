package com.utp.edu.pe.melamiserviceBackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserProfileDto {

    private Long id;

    private String name;

    private String description;


}
