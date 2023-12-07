package week_12.assignment.question_12_09;

public class BinaryFormatException extends Exception{
    private String message;

    public BinaryFormatException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
