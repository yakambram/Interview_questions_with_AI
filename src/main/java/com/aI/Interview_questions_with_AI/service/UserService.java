package com.aI.Interview_questions_with_AI.service;

import com.aI.Interview_questions_with_AI.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO createUser(UserDTO userDTO);

    List<UserDTO> getAllUsers();

    UserDTO updateUserById(Long userId,UserDTO userDTO);

    UserDTO deleteUserById(Long userId);

}
