package com.aI.Interview_questions_with_AI.repository;

import com.aI.Interview_questions_with_AI.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
