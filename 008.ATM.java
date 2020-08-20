import java.util.Scanner;

public class ATM {
    public void work(Account account) {
        Login login = new Login();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bankamıza Hoşgeldiniz...");
        System.out.println("--------------------------------");
        System.out.println("Kullanıcı Girişi");
        System.out.println("--------------------------------");
        int entry = 3;

        while (true)
        {
            if (login.login(account)){
                System.out.println("Giriş Başarılır");
                break;
            }
            else {
                System.out.println("Giriş Başarısız");
                entry -= 1;
                System.out.println("Kalan Giriş Hakkınız: " + entry);
            }
            if (entry == 0) {
                System.out.println("Giriş Hakkınız Bitti");
                return;
            }
        }
        System.out.println("--------------------------------");
        String transactions = "1. Bakiye Görüntüle\n" +
                "2. Para Yatırma\n" +
                "3. Para Çekme\n" +
                "Çıkış için q'ya basınız";
        System.out.println(transactions);
        System.out.println("--------------------------------");

        while (true) {
            System.out.println("İşlemi seçiniz");
            String transaction = scanner.next();

            if (transaction.equals("q")) {
                break;
            }
            else if (transaction.equals("1")) {
                System.out.println("Bakiyeniz: " + account.getBalance());
            }
            else if (transaction.equals("2")) {
                System.out.println("Yatırmak istediğiniz tutar: ");
                int amount = scanner.nextInt();
                account.depositMoney(amount);
            }
            else if (transaction.equals("3")) {
                System.out.println("Çekmek istediğiniz tutar: ");
                int amount = scanner.nextInt();
                account.withdrawMoney(amount);
            }
            else {
                System.out.println("Geçersiz işlem!!");
            }
        }
    }
}
