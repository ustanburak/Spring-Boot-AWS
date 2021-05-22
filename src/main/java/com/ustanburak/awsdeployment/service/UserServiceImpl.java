package com.ustanburak.awsdeployment.service;

import com.ustanburak.awsdeployment.dto.UserDto;
import com.ustanburak.awsdeployment.entity.User;
import com.ustanburak.awsdeployment.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public List<UserDto> getUsers() {
        return userRepository.findAll().stream() //
                .map(user -> mapToUserResponse(user)) //
                .collect(Collectors.toList()); //

    }

    private UserDto mapToUserResponse(User user) {
        return UserDto.builder() //
                .id(user.getId()) //
                .username(user.getUsername()) //
                .build(); //
    }

}
