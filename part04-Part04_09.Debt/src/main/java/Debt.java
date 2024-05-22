public class Debt {
    private double initBalance;
    private double initInterestRate;

    public Debt(double initialBalance, double initialInterestRate) {
        this.initBalance = initialBalance;
        this.initInterestRate = initialInterestRate;
    }

    public void printBalance() {
        System.out.println("value: " + initBalance);

    }

    public void waitOneYear() {
        this.initBalance = initBalance * initInterestRate;
    }

}
