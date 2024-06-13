package com.aI.InterviewquestionswithAI.service;

import com.aI.InterviewquestionswithAI.dto.InterviewOptionDTO;

import java.util.List;

public interface InterviewOptionService {
    InterviewOptionDTO createInterviewOption(InterviewOptionDTO interviewOptionDTO);

    List<InterviewOptionDTO> getAllInterviewOptions();

    InterviewOptionDTO updateInterviewOptionById(Long interviewOptionId,InterviewOptionDTO interviewOptionDTO);

    InterviewOptionDTO deleteInterviewOptionById(Long interviewOptionId);
}
