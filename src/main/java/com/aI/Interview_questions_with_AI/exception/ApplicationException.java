package com.aI.Interview_questions_with_AI.exception;

public class ApplicationException extends RuntimeException{
    public ApplicationException(String message) {
        super(message);
    }

    public ApplicationException(String message, Throwable cause) {
        super(message, cause);
    }
}
