package com.aI.InterviewquestionswithAI.service;

import com.aI.InterviewquestionswithAI.dto.InterviewQuestionCategoryDTO;

import java.util.List;

public interface InterviewQuestionCategoryService {
    InterviewQuestionCategoryDTO createInterviewQuestionCategory(InterviewQuestionCategoryDTO interviewQuestionCategoryDTO);

    List<InterviewQuestionCategoryDTO> getAllInterviewQuestionCategory();

    InterviewQuestionCategoryDTO updateInterviewQuestionCategoryById(Long interviewQuestionCategoryId,InterviewQuestionCategoryDTO interviewQuestionCategoryDTO);

    InterviewQuestionCategoryDTO InterviewQuestionCategoryById(Long interviewQuestionCategoryId);
}
