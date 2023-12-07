package week_10.assignment.question_10_08__;

public class Tax {
    private int filingStatus;
    public static final int SINGLE_FILER = 0;

    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;

    public Tax() {

    }

    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public int getFilingStatus() {
        return filingStatus;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public double[] getRates() {
        return rates;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double getTax() {
        int[] bracket = brackets[filingStatus];
        double[] rate = rates;
        double income = taxableIncome;
        double tax = brackets[filingStatus][0] * rates[0];
        for (int i = 1; brackets.length > i; i++) {
            if (income > bracket[i]) {
                tax += (bracket[i] - bracket[i - 1]) * rates[i];
            }else {
                tax+=(income-bracket[i-1])*rates[i];
                break;
            }
        }
return tax;

    }


}
