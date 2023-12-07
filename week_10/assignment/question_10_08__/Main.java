package week_10.assignment.question_10_08__;

public class Main {
    public static void main(String[] args) {
        int[][] brackets2009 = {
                {8350, 33950, 82250, 171550, 372950},
                {16700, 67900, 137050, 20885, 372950},
                {8350, 33950, 68525, 104425, 186475},
                {11950, 45500, 117450, 190200, 372950}
        };
        int[][] brackets2001 = {
                {27050, 65550, 136750, 297350},
                {45200, 109250, 16500, 297350},
                {22600, 54625, 83250, 148675},
                {36250, 93650, 151650, 297350}
        };

        double[] rates2009 = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        double[] rates2001 = {0.15,0.275,0.305,0.355,0.391};

        System.out.println("                        2009 Taxes                 ");
        System.out.println("Income     Status 0     Status 1     Status 2     Status 3");
        System.out.println("-------------------------------------------------------------");
        for (int i = 5000; i <6000 ; i+=1000) {
            System.out.println(i);
            Tax tax1=new Tax(Tax.SINGLE_FILER,brackets2001,rates2001,i);
            Tax tax2=new Tax(Tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER,brackets2001,rates2001,i);
            Tax tax3=new Tax(Tax.MARRIED_SEPARATELY,brackets2001,rates2001,i);
            Tax tax4=new Tax(Tax.HEAD_OF_HOUSEHOLD,brackets2001,rates2001,i);
            System.out.println(tax1.getTax()+"  "+tax2.getTax()+"   "+tax3.getTax()+"   "+tax4.getTax());

        }


    }
}
