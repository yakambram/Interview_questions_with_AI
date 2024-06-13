package com.aI.InterviewquestionswithAI.mapper;

import com.aI.InterviewquestionswithAI.dto.UserDTO;
import com.aI.InterviewquestionswithAI.entity.User;
import org.modelmapper.ModelMapper;

public class UserMapper {
    public static final  ModelMapper modelMapper = new ModelMapper();

    public static UserDTO convertToDTO(User user){

        return modelMapper.map(user,UserDTO.class);
    }
    public static User convertToEntity(UserDTO userDTO){
        return modelMapper.map(userDTO,User.class);

    }
}
