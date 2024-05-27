package com.utp.edu.pe.melamiserviceBackend.dto;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserRequest {

    @NotNull
    private String username;

    @NotNull
    private String password;

}
