package com.aI.InterviewquestionswithAI.exception;

public class ApplicationBusinessException extends ApplicationException{
    public ApplicationBusinessException(String message) {
        super(message);
    }

    public ApplicationBusinessException(String message, Throwable cause) {
        super(message, cause);
    }

}
