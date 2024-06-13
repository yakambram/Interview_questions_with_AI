package com.aI.InterviewquestionswithAI.mapper;

import com.aI.InterviewquestionswithAI.dto.InterviewOptionDTO;
import com.aI.InterviewquestionswithAI.entity.InterviewOption;
import org.modelmapper.ModelMapper;

public class InterviewOptionMapper {
    public static final ModelMapper modelMapper = new ModelMapper();

    public static InterviewOptionDTO convertToDTO(InterviewOption interviewOption){
        return modelMapper.map(interviewOption,InterviewOptionDTO.class);
    }
    public static InterviewOption convertToEntity(InterviewOptionDTO interviewOptionDTO){
        return modelMapper.map(interviewOptionDTO,InterviewOption.class);
    }
}
