package com.aI.InterviewquestionswithAI.service;

import com.aI.InterviewquestionswithAI.dto.InterviewQuestionDTO;

import java.util.List;

public interface InterviewQuestionService {
    InterviewQuestionDTO createInterviewQuestionDTO(InterviewQuestionDTO interviewQuestionDTO);

    List<InterviewQuestionDTO> getAllInterviewQuestionDTO();

    InterviewQuestionDTO updateInterviewQuestionDTOById(Long interviewQuestionId,InterviewQuestionDTO interviewQuestionDTO);

    InterviewQuestionDTO deleteInterviewQuestionDTOById(Long interviewQuestionId);
}
