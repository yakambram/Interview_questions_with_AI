package com.aI.InterviewquestionswithAI.repository;

import com.aI.InterviewquestionswithAI.entity.InterviewQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterviewQuestionRepository extends JpaRepository<InterviewQuestion,Long> {
}
