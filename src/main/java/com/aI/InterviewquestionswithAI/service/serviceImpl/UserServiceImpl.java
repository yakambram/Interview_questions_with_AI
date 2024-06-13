package com.aI.InterviewquestionswithAI.service.serviceImpl;

import com.aI.InterviewquestionswithAI.dto.UserDTO;
import com.aI.InterviewquestionswithAI.entity.User;
import com.aI.InterviewquestionswithAI.exception.ApplicationBusinessException;
import com.aI.InterviewquestionswithAI.mapper.UserMapper;
import com.aI.InterviewquestionswithAI.repository.UserRepository;
import com.aI.InterviewquestionswithAI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDTO createUser(UserDTO userDTO) throws ApplicationBusinessException {
        try {
            User userEntity = UserMapper.convertToEntity(userDTO);
            userEntity.setName(userDTO.getName());
            userEntity.setEmailId(userDTO.getEmailId());
            userEntity.setPhoneNumber(userDTO.getPhoneNumber());

            User save = userRepository.save(userEntity);
            return UserMapper.convertToDTO(save);
        }catch (ApplicationBusinessException e){
            throw new ApplicationBusinessException("Error while Adding User");
        }
    }

    @Override
    public List<UserDTO> getAllUsers() {
        List<User> findAll = userRepository.findAll();

        List<UserDTO> users= findAll.stream()
                .map(e ->UserMapper.convertToDTO(e))
                .collect(Collectors.toList());
        return users;

    }

    @Override
    public UserDTO updateUserById(Long userId, UserDTO userDTO) throws ApplicationBusinessException {
        try {
            User user = userRepository.findById(userId).orElseThrow(() -> new ApplicationBusinessException("User not found"));

            user.setName(userDTO.getName());
            user.setEmailId(userDTO.getEmailId());
            user.setPhoneNumber(userDTO.getPhoneNumber());
            user.setPassword(userDTO.getPassword());
            User updateUser = userRepository.save(user);

            return UserMapper.convertToDTO(updateUser);
        }catch (ApplicationBusinessException e){}
        throw new ApplicationBusinessException("user update failed");
    }

    @Override
    public UserDTO deleteUserById(Long userId) throws ApplicationBusinessException{
        try {
            User deleteUser = userRepository.findById(userId).orElseThrow(() -> new ApplicationBusinessException("User Id Not Founded"));
            userRepository.deleteById(userId);
            return UserMapper.convertToDTO(deleteUser);
        }catch (ApplicationBusinessException e){
            throw  new ApplicationBusinessException("failed to delete User ");

        }
    }
}
