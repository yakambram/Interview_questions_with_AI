package com.aI.InterviewquestionswithAI.controller;

import com.aI.InterviewquestionswithAI.dto.SubscriberDTO;
import com.aI.InterviewquestionswithAI.entity.ApiResponse;
import com.aI.InterviewquestionswithAI.exception.ApplicationBusinessException;
import com.aI.InterviewquestionswithAI.service.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Subscribers")
public class SubscriberController {
    @Autowired
    private SubscriberService subscriberService;

    @PostMapping("/creatingSubscriber")
    public ResponseEntity<ApiResponse<SubscriberDTO>> createSubscribe(@RequestBody SubscriberDTO subscriberDTO) throws ApplicationBusinessException {
        ApiResponse<SubscriberDTO> response = new ApiResponse<>();
        try {
            SubscriberDTO saveSubscriberDTO = subscriberService.createSubscriberDTO(subscriberDTO);

            if (saveSubscriberDTO != null) {
                response.setStatus(200);
                response.setMessage(" Subscriber created Successfully...!");
                response.setData(saveSubscriberDTO);
                return new ResponseEntity<>(response, HttpStatus.CREATED);
            }else{
                response.setStatus(500);
                response.setMessage("Failed to create Subscribe.....!");
                return new ResponseEntity<>(response,HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }catch (ApplicationBusinessException a){
            response.setStatus(500);
            response.setMessage("Failed to create Subscribe.....!");
            return new ResponseEntity<>(response,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/getAllSubscribers")
    public ResponseEntity<ApiResponse<List<SubscriberDTO>>> getAllSubscribers(){
        ApiResponse<List<SubscriberDTO>> response=new ApiResponse<>();
        List<SubscriberDTO> allSubscribers= subscriberService.getAllSubscriberDTO();

        if(allSubscribers != null){
            response.setStatus(200);
            response.setMessage("Successfully fetched AllSubscribers....!  ");
            response.setData(allSubscribers);
            return new ResponseEntity<>(response,HttpStatus.OK);
        }else {
            response.setStatus(500);
            response.setMessage("failed to fetched AllSubscribers.....!");
            return new ResponseEntity<>(response,HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @PutMapping("/updateSubscriber/{subscriberId}")
    public ResponseEntity<ApiResponse<SubscriberDTO>> updateSubscriber(@PathVariable Long subscriberId,@RequestBody SubscriberDTO subscriberDTO) throws ApplicationBusinessException {
        ApiResponse<SubscriberDTO> response = new ApiResponse<>();
        try {
            SubscriberDTO updateSubscriber = subscriberService.updateSubscriberDTOById(subscriberId, subscriberDTO);
            if (updateSubscriber != null) {
                response.setStatus(200);
                response.setMessage("Successfully updatedSubscriber...!");
                response.setData(updateSubscriber);
                return new ResponseEntity<>(response, HttpStatus.OK);
            } else {
                response.setStatus(500);
                response.setMessage("failed update Subscriber....");
                return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
            }

        }catch (ApplicationBusinessException a){
            response.setStatus(500);
            response.setMessage("failed update Subscriber....");
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @DeleteMapping("/deleteSubscriber/{subscriberId}")

    public ResponseEntity<ApiResponse<SubscriberDTO>> deleteSubscriber(@PathVariable Long subscriberId) throws ApplicationBusinessException {
        ApiResponse<SubscriberDTO> response = new ApiResponse<>();
        try {
            SubscriberDTO deleteSubscriber = subscriberService.deleteSubscriberDTOById(subscriberId);
            if (deleteSubscriber != null) {
                response.setStatus(200);
                response.setMessage("Successfully updatedSubscriber...!");
                response.setData(deleteSubscriber);
                return new ResponseEntity<>(response, HttpStatus.OK);
            } else {
                response.setStatus(500);
                response.setMessage("failed update Subscriber....");
                return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
            }

        }catch (ApplicationBusinessException a){
            response.setStatus(500);
            response.setMessage("failed update Subscriber....");
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
