package com.utp.edu.pe.melamiserviceBackend.service;

import com.utp.edu.pe.melamiserviceBackend.dto.UserDto;
import com.utp.edu.pe.melamiserviceBackend.exception.UserNotFoundException;
import com.utp.edu.pe.melamiserviceBackend.mapper.UserMapper;
import com.utp.edu.pe.melamiserviceBackend.repository.Entity.UserEntity;
import com.utp.edu.pe.melamiserviceBackend.repository.Jpa.UserRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    private final UserMapper userMapper;

    public UserDto loadUserByUsername(String username, String password){
        UserEntity user = this.userRepository.findByUserName(username, password);
        if (user == null){
            throw new UserNotFoundException();
        }
        return this.userMapper.toUserDto(user);
    }

}
