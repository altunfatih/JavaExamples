public static void main(String[] args) {
        Account account = new Account(1,1000);

        account.setAnnualInterestRate(1.5);
        System.out.println(account.getDateCreated());
        System.out.println(account.getMonthlyInterestRate(1.5));
        System.out.println(account.getMonthlyInterest(1.5));
        System.out.println(account.withdraw(500));
        System.out.println(account.deposit(500));
}