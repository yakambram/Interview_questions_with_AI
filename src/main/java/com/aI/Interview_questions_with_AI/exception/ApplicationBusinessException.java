package com.aI.Interview_questions_with_AI.exception;

public class ApplicationBusinessException extends ApplicationException{
    public ApplicationBusinessException(String message) {
        super(message);
    }

    public ApplicationBusinessException(String message, Throwable cause) {
        super(message, cause);
    }

}
