package com.aI.InterviewquestionswithAI.repository;

import com.aI.InterviewquestionswithAI.entity.InterviewQuestionCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterviewQuestionCategoryRepository extends JpaRepository<InterviewQuestionCategory,Long> {
}
