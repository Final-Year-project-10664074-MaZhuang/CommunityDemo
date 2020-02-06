package life.majiang.community.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode{
    QUESTION_NOT_FOUND(2001,"The problem you're looking for is gone. Would you like to try another one"),
    TARGET_PARAM_NOT_FOUND(2002,"No questions or comments selected to reply"),
    NO_LOG_IN(2003,"Unable to comment without logging in at present, please log in first"),
    SYS_ERROR(2004,"server is busy"),
    TYPE_PARAM_WRONG(2005,"Wrong or nonexistent comment type"),
    COMMENT_NOT_FOUND (2006,"Wrong or nonexistent comment type"),
    CONTENT_IS_EMPTY (2007,"Comment content cannot be empty"),
    READ_NOTIFICATION_FAIL (2008,"Information read error"),
    NOTIFICATION_NOT_FOUND (2009,"No response found");
    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    private Integer code;
    private String message;
    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }
}
