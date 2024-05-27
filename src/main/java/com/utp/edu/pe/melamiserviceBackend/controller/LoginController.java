package com.utp.edu.pe.melamiserviceBackend.controller;

import com.utp.edu.pe.melamiserviceBackend.dto.UserDto;
import com.utp.edu.pe.melamiserviceBackend.dto.UserRequest;
import com.utp.edu.pe.melamiserviceBackend.service.UserService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="*")
@RestController
@RequiredArgsConstructor
public class LoginController {

    private final UserService userService;

    @PostMapping("/login")
    public UserDto login(UserRequest userRequest){
        return this.userService.loadUserByUsername(userRequest.getUsername(),userRequest.getPassword());
    }

}
