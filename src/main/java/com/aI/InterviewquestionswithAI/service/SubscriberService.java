package com.aI.InterviewquestionswithAI.service;

import com.aI.InterviewquestionswithAI.dto.SubscriberDTO;
import com.aI.InterviewquestionswithAI.dto.UserDTO;

import java.util.List;

public interface SubscriberService {

    SubscriberDTO createSubscriberDTO(SubscriberDTO subscriberDTO);

    List<SubscriberDTO> getAllSubscriberDTO();

    SubscriberDTO updateSubscriberDTOById(Long subscriberId,SubscriberDTO subscriberDTO);

    SubscriberDTO deleteSubscriberDTOById(Long subscriberId);
}
