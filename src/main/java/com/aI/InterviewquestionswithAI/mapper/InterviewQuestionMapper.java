package com.aI.InterviewquestionswithAI.mapper;

import com.aI.InterviewquestionswithAI.dto.InterviewQuestionDTO;
import com.aI.InterviewquestionswithAI.entity.InterviewQuestion;
import org.modelmapper.ModelMapper;

public class InterviewQuestionMapper {
    public static final ModelMapper modelMapper = new ModelMapper();
    public static InterviewQuestionDTO convertToDTO(InterviewQuestion interviewQuestion){
        return modelMapper.map(interviewQuestion,InterviewQuestionDTO.class);

    }
    public static InterviewQuestion convertToEntity(InterviewQuestionDTO interviewQuestionDTO){
        return modelMapper.map(interviewQuestionDTO,InterviewQuestion.class);

    }

}
