package week_12.assignment.question_12_08;

public class HexFormatException extends Exception {
    private String message;

    public HexFormatException() {
        super("Invalid Value!!");
    }

    public HexFormatException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
