package com.aI.InterviewquestionswithAI.service;

import com.aI.InterviewquestionswithAI.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO createUser(UserDTO userDTO);

    List<UserDTO> getAllUsers();

    UserDTO updateUserById(Long userId,UserDTO userDTO);

    UserDTO deleteUserById(Long userId);

}
