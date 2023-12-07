package week_09.assignment.question_09_02;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        System.out.println("Stock name   : "+(stock.name = "Oracle Corporation"));
        System.out.println("Stock symbol : "+(stock.symbol = "ORCL"));
        stock.currentPrice = 34.5;
        stock.setNewCurrentPrice(34.35);
        System.out.println("Price-change percentage: " + stock.getChangePercent());
    }
}
