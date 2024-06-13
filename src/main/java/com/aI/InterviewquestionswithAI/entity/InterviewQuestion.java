package com.aI.InterviewquestionswithAI.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InterviewQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long InterviewQuestionId;
    private String InterviewQuestionText;
    @ManyToOne
    @JoinColumn(name = "interview_Question_Category_Id")
    private InterviewQuestionCategory interviewQuestionCategory;
}
