package com.aI.InterviewquestionswithAI.repository;
import com.aI.InterviewquestionswithAI.entity.InterviewOption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterviewOptionRepository extends JpaRepository<InterviewOption,Long>{

}
