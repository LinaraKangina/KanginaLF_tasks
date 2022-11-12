package task_10;

public class ZeroOrNegativeLenghtException extends Exception{


    public ZeroOrNegativeLenghtException(String message) {
        super(message);
    }

    public ZeroOrNegativeLenghtException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
