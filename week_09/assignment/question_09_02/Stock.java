package week_09.assignment.question_09_02;

public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
   Stock(String symbol,String name){
       this.symbol=symbol;
       this.name=name;

   }
   double getChangePercent(){
return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
   }
   public void setNewCurrentPrice(double newCurrentPrice){
previousClosingPrice=currentPrice;
currentPrice=newCurrentPrice;


   }
}
