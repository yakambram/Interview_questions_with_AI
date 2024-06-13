package com.aI.Interview_questions_with_AI.mapper;

import com.aI.Interview_questions_with_AI.dto.UserDTO;
import com.aI.Interview_questions_with_AI.entity.User;
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
