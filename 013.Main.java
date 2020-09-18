public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Sabiha Gökçen Havalimanına Hoşgeldiniz...");

        String conditions = "Yurtdışı Çıkış Kuralları...\n" +
                "1-Herhangi bir siyasi yasak olmamalı\n" +
                "2-15 TL olan harç beledini tam olarak yatırmalısın\n" +
                "3-Gideceğiniz ülkeye vizenizin bulunması gerek";
        String message = "Yurdışı şartlarından hepsini sağlamalısınız!!";

        while (true) {
            System.out.println("******************************************************");
            System.out.println(conditions);
            System.out.println("******************************************************");

            Passenger passenger = new Passenger();

            System.out.println("Harc beledi kontrol ediliyor");
            Thread.sleep(3000);

            if (passenger.abroad_fee_control() == false) {
                System.out.println(message);
                continue;
            }

            System.out.println("Siyasi yasak kontrol ediliyor");
            Thread.sleep(3000);
            if (passenger.political_control() == false) {
                System.out.println(message);
                continue;
            }

            System.out.println("Vizeniz kontrol ediliyor");
            Thread.sleep(3000);
            if (passenger.visa_control() == false) {
                System.out.println(message);
                continue;
            }
            System.out.println("İşlemeriniz tamam! Yurtdışına çıkabilirsiniz...");
            break;
        }
    }
}
