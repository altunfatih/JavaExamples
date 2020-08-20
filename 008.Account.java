public class Account {
    private String id, pass;
    private int balance;

    public Account(String id, String pass, int balance) {
        this.id = id;
        this.pass = pass;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void depositMoney(int quantity) {
        balance += quantity;
        System.out.println("Yeni bakiyeniz: " + balance);
    }
    public void withdrawMoney(int quantity) {
        if ((balance - quantity) < 0)
        {
            System.out.println("Yetersiz bakiye !!");
        }
        else {
            balance -= quantity;
            System.out.println("Yeni bakiyeniz: " + balance);
        }
    }
}
