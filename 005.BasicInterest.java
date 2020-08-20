import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double money, interest = 0.06;
        int year;

        System.out.print("Ana Paranızı Giriniz = ");
        money = scanner.nextInt();
        System.out.print("Kaç Yıl Boyunca Vadeli Hesabinizda Tutacaksınız = ");
        year = scanner.nextInt();

        for (int i = 0; i < year; i++) {
            money = (money * interest) + money;
        }

        System.out.println(year + ". Yılın Sonunda Toplam Paranız = " + money);
    }
}