package com.aI.InterviewquestionswithAI.repository;

import com.aI.InterviewquestionswithAI.entity.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriberRepository extends JpaRepository<Subscriber,Long> {
}
