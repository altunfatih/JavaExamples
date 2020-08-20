import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int balance = 1000, money, selection;
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Yapmak İstediğiniz işlemi seçiniz: \n" +
                    "1 - Bakiye Öğrenme \n" +
                    "2 - Para Çekme \n" +
                    "3 - Para Yatırma \n" +
                    "4 - Çıkış");

            selection = scanner.nextInt();

            switch (selection) {
                case 1 :
                    System.out.println("Bakiyeniz = " + balance);
                    break;

                case 2 :
                    System.out.print("Çekmek İstediğiniz parayı giriniz: ");
                    money = scanner.nextInt();

                    if (balance > 0 && money < balance){
                        balance = balance - money;
                        System.out.println("Yeni bakiyeniz = " + balance);
                    }
                    else {
                        System.out.println("Bakiyeniz sıfırdan küçük veya girdiğiniz para bakiyenizden büyük");
                    }
                    break;

                case 3 :
                    System.out.print("Yatırmak İstediğiniz parayı giriniz: ");
                    money = scanner.nextInt();
                    if (money < 0){
                        System.out.println("Eksi para yatıralamaz");
                    }
                    else{
                        balance = balance + money;
                        System.out.println("Yeni bakiye = " + balance + "\n");
                    }
                    break;
                case 4 :
                    System.out.println("Çıkış yapılıyor...");
                    return;
            }
        }
    }
}