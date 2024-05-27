package com.utp.edu.pe.melamiserviceBackend.mapper;

import com.utp.edu.pe.melamiserviceBackend.dto.UserDto;
import com.utp.edu.pe.melamiserviceBackend.repository.Entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    //@Mapping(source = "password", ignore = true)
    UserDto toUserDto (UserEntity userEntity);
}
