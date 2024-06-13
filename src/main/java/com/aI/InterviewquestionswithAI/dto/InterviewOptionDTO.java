package com.aI.InterviewquestionswithAI.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InterviewOptionDTO {
    private Long optionId;
    private String optionName;
    private String interviewQuestionId;
    private Boolean isCorrectOption;
}
