package week_01.assignments;

public class Question_01_11 {
    public static void main(String[] Args){
        System.out.println("Population projection");
        System.out.println("Current population: 312032486");
        System.out.println("One birth every 7 seconds.");
        System.out.println("One death every 13 seconds.");
        System.out.println("One new immigrant every 45 seconds.");
        System.out.println("Yearly Population projection formula:");
        System.out.println("Current population + ( (births per year) - (deaths per year) + (new immigrants per year))");
        System.out.print("Year 1 projection projection = ");
        System.out.println(312032486.0+(60*60*24*365/7)-(60*60*24*365/13)+(60*60*24*365/45) );
        System.out.print("Year 2 projection projection = ");
        System.out.println(312032486.0+((60*60*24*365/7)-(60*60*24*365/13)+(60*60*24*365/45))*2 );
        System.out.print("Year 3 projection projection = ");
        System.out.println(312032486.0+((60*60*24*365/7)-(60*60*24*365/13)+(60*60*24*365/45))*3 );
        System.out.print("Year 4 projection projection = ");
        System.out.println(312032486.0+((60*60*24*365/7)-(60*60*24*365/13)+(60*60*24*365/45))*4 );
        System.out.print("Year 5 projection projection = ");
        System.out.println(312032486.0+((60*60*24*365/7)-(60*60*24*365/13)+(60*60*24*365/45))*5 );

    }
}
