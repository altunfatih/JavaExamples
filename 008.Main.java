public class Main {

    public static void main(String[] args) {
        ATM atm = new ATM();
        Account account = new Account("Admin", "admin", 2000);

        atm.work(account);

        System.out.println("Programdan çıkılıyor...");
    }
}
