package TVSimulation;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static TV tv;
    public static void main(String[] args) {

        menuPrint();
        boolean exit = false;

        while (exit == false){
            System.out.println("Seçiminiz: (Menüyü Görmek İçin 8'e basınız)");
            int choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    tvSetup();
                    break;
                case 2:
                    tvOpen();
                    break;
                case 3:
                    voiceEnh();
                    break;
                case 4:
                    voiceRed();
                    break;
                case 5:
                    changeChannel();
                    break;
                case 6:
                    channelPrint();
                    break;
                case 7:
                    tvClose();
                    break;
                case 8:
                    menuPrint();
                    break;
                case 0:
                    System.out.println("Sistemden çıkılıyor");
                    exit = true;
                    break;
                default:
                    System.out.println("0 - 8 Arasında bir değer giriniz");
                    break;
            }
        }
    }

    private static void channelPrint() {
        if (tv != null) {
            tv.activeChannelPrint();
        } else {
            System.out.println("Önce TV' yi kurun ve kanalları oluşturun");
        }
    }

    private static void changeChannel() {
        if (tv != null) {
            System.out.print("Hangi kanalı açmak istiyorusnuz: ");
            int openChannels = scanner.nextInt();
            tv.changeChannel(openChannels);
        } else {
            System.out.println("Önce TV' yi kurun ve kanalları oluşturun");
        }
    }

    private static void voiceEnh() {
        if (tv != null) {
            tv.voiceEnh();
        } else {
            System.out.println("Önce TV' yi kurun ve kanalları oluşturun");
        }
    }

    private static void voiceRed() {
        if (tv != null) {
            tv.voiceRed();
        } else {
            System.out.println("Önce TV' yi kurun ve kanalları oluşturun");
        }
    }

    private static void tvClose() {
        if (tv != null) {
            tv.tvClose();
        } else {
            System.out.println("Önce TV' yi kurun ve kanalları oluşturun");
        }
    }

    private static void tvOpen() {
        if (tv != null) {
            tv.tvOpen();
        } else {
            System.out.println("Önce TV' yi kurun ve kanalları oluşturun");
        }
    }

    private static void tvSetup() {
        if (tv == null) {
            scanner.nextLine();
            System.out.print("Televizyonun Markasını Giriniz: ");
            String brand = scanner.nextLine();
            System.out.print("Televizyonun boyutunu giriniz: ");
            String inc = scanner.nextLine();
            tv = new TV(brand, inc);
            System.out.println(tv);
        } else {
            System.out.println(tv);
        }

    }

    private static void menuPrint() {
        System.out.println("***************************** MENU *****************************");
        System.out.println("0 -- Çıkış\n" +
                "1 -- Televizyonu Kur\n" +
                "2 -- Televizyonu Aç\n" +
                "3 -- Sesini Arttır\n" +
                "4 -- Sesi Azalt\n" +
                "5 -- Kanal Değiştir\n" +
                "6 -- Kanal Bilgisini Göster\n" +
                "7 -- Televizyonu Kapat\n" +
                "8 -- Menüyü Göster\n");
    }
}
