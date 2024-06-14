package com.aI.InterviewquestionswithAI.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubscriberDTO {
    private Long subscriberId;
    private String subscriberName;
    private LocalDateTime subscriptionStartDate;
    private LocalDateTime SubscriptionEndDate;
}
