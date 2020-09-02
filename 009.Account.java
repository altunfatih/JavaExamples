import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated = new Date();

    Account(){

    }

    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public double getMonthlyInterestRate(double annualInterestRate) {
        return this.annualInterestRate = (balance * annualInterestRate);
    }

    public double getMonthlyInterest(double annualInterestRate) {
        return this.annualInterestRate = (annualInterestRate * 100);
    }

    public double withdraw(double money) {
        return balance = balance - money;
    }

    public double deposit(double money) {
        return balance = balance + money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}
