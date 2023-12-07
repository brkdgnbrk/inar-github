package week_12.assignment.question_12_10;

public class OutOfMemoryError {
    public static void main(String[] args) {
        try {
            byte[] byteArray = new byte[Integer.MAX_VALUE];
        }catch (java.lang.OutOfMemoryError ex){
            System.out.println("Array size exceeds VM limit");
        }
    }
}
