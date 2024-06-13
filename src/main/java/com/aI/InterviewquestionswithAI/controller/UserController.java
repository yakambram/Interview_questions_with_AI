package com.aI.InterviewquestionswithAI.controller;

import com.aI.InterviewquestionswithAI.dto.UserDTO;
import com.aI.InterviewquestionswithAI.entity.ApiResponse;
import com.aI.InterviewquestionswithAI.exception.ApplicationBusinessException;
import com.aI.InterviewquestionswithAI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping("/createUser")
    public ResponseEntity<ApiResponse<UserDTO>> createUser(@RequestBody UserDTO userDTO){
        ApiResponse<UserDTO> response = new ApiResponse<>();

        try {
            UserDTO saveUserDTO = userService.createUser(userDTO);
            if(saveUserDTO!= null){
                response.setStatus(200);
                response.setMessage("User Created Successfully");
                response.setData(saveUserDTO);
                return new ResponseEntity<>(response, HttpStatus.CREATED);
            }
            response.setStatus(500);
            response.setMessage("User Creation Failed");
            return new ResponseEntity<>(response,HttpStatus.INTERNAL_SERVER_ERROR);

        }catch (ApplicationBusinessException e){
            response.setStatus(500);
            response.setMessage("User Creation Failed");
            return new ResponseEntity<>(response,HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @GetMapping("/getAllUsers")

    public ResponseEntity<ApiResponse<List<UserDTO>>> getAllUsers(){
        ApiResponse<List<UserDTO>> response= new ApiResponse<>();
        List<UserDTO> userDTO= userService.getAllUsers();
        if(userDTO != null){
            response.setStatus(200);
            response.setMessage("fetch all Users Successfully");
            response.setData(userDTO);
            return new ResponseEntity<>(response,HttpStatus.OK);
        }else{
            response.setStatus(500);
            response.setMessage("fetching Users are Failed");
            return new ResponseEntity<>(response,HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @PutMapping("/updateUser/{userId}")
    public ResponseEntity<ApiResponse<UserDTO>> updateById(@PathVariable Long userId ,@RequestBody UserDTO userDTO ) throws ApplicationBusinessException{
        ApiResponse<UserDTO> response= new ApiResponse<>();
        try {
            UserDTO updateUser = userService.updateUserById(userId, userDTO);
            if (updateUser != null) {
                response.setStatus(200);
                response.setMessage("User Updated Successfully....!");
                response.setData(updateUser);
                return new ResponseEntity<>(response, HttpStatus.OK);
            } else {
                response.setStatus(500);
                response.setMessage(" Failed  Updated User");
                return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }catch (ApplicationBusinessException e){
            response.setStatus(500);
            response.setMessage(" Failed  Updated User");
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);

        }

    }
    @DeleteMapping("/deleteUser/{userId}")
    public ResponseEntity<ApiResponse<UserDTO>> deleteUserById( @PathVariable  Long userId) throws ApplicationBusinessException{
        ApiResponse<UserDTO> response = new ApiResponse<>();
        try {

            UserDTO deleteUser = userService.deleteUserById(userId);
            if (deleteUser != null) {
                response.setStatus(200);
                response.setMessage("User deleted Successfully....!");
                response.setData(deleteUser);
                return new ResponseEntity<>(response, HttpStatus.OK);
            } else {
                response.setStatus(500);
                response.setMessage("failed to delete User....!");
                return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }catch (ApplicationBusinessException e){
            response.setStatus(500);
            response.setMessage("failed to delete User....!");
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
