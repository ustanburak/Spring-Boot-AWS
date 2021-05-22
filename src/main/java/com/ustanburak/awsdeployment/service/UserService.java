package com.ustanburak.awsdeployment.service;

import com.ustanburak.awsdeployment.dto.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> getUsers();

}
