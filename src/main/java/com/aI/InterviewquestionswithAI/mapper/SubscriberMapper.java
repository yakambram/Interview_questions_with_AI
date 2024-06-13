package com.aI.InterviewquestionswithAI.mapper;

import com.aI.InterviewquestionswithAI.dto.SubscriberDTO;
import com.aI.InterviewquestionswithAI.entity.Subscriber;
import org.modelmapper.ModelMapper;

public class SubscriberMapper {
    public static final ModelMapper modelMapper = new ModelMapper();

    public static SubscriberDTO convertToDTO(Subscriber subscriber){
        return modelMapper.map(subscriber,SubscriberDTO.class);

    }
    public static Subscriber convertToDTO(SubscriberDTO subscriberDTO){
        return modelMapper.map(subscriberDTO,Subscriber.class);

    }
}
