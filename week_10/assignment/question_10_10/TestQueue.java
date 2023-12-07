package week_10.assignment.question_10_10;

public class TestQueue {
    public static void main(String[] args) {
        Queue queue = new Queue(20);
        for (int i = 1; i < 21; i++) {
            queue.enqueue(i);
        }
        int[] element = queue.getElements();
        for (int i = 0; i < queue.getSize(); i++) {
            System.out.print(element[i] + "  ");
        }
        System.out.println("\n----------------------------------------------------------");
        for (int i = 0; i < 5; i++) {
            queue.dequeue();
        }
        while (!queue.empty()) {
            System.out.print(queue.dequeue() + " ");

        }
    }
}