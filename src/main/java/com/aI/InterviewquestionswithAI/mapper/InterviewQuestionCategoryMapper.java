package com.aI.InterviewquestionswithAI.mapper;

import com.aI.InterviewquestionswithAI.dto.InterviewQuestionCategoryDTO;
import com.aI.InterviewquestionswithAI.entity.InterviewQuestionCategory;
import org.modelmapper.ModelMapper;

public class InterviewQuestionCategoryMapper {
    public static final ModelMapper modelMapper = new ModelMapper();

    public static InterviewQuestionCategoryDTO convertToDTO(InterviewQuestionCategory interviewQuestionCategory){
        return modelMapper.map(interviewQuestionCategory, InterviewQuestionCategoryDTO.class);
    }

    public static InterviewQuestionCategory convertToEntity(InterviewQuestionCategoryDTO interviewQuestionCategoryDTO){
        return modelMapper.map(interviewQuestionCategoryDTO, InterviewQuestionCategory.class);
    }
}
