import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("YGS - LYS Birinci Bulma Programı...");
        Scanner scanner = new Scanner(System.in);

        String transactions = "İşlemler...\n" +
                "1. Eşit Ağırlık Öğrencilerin Birinicisi\n" +
                "2. Sayısal Öğrencilerin Birincisi";

        System.out.println("*******************************************");
        System.out.println(transactions);
        System.out.println("*******************************************");

        while (true) {
            System.out.println("Çıkış için q'ya basın");
            String answer = scanner.nextLine();
            if (answer.equals("q")) {
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            // first student
            System.out.print("Birinci Öğrencinin İsmi: ");
            String name1 = scanner.nextLine();
            System.out.println("Netler (Türkçe Matematik Edebiyat Fizik): ");
            int turkish1 = scanner.nextInt();
            int math1 = scanner.nextInt();
            int literature1 = scanner.nextInt();
            int physics1 = scanner.nextInt();
            scanner.nextLine();

            // second student
            System.out.print("İkinci Öğrencinin İsmi: ");
            String name2 = scanner.nextLine();
            System.out.println("Netler (Türkçe Matematik Edebiyat Fizik): ");
            int turkish2 = scanner.nextInt();
            int math2 = scanner.nextInt();
            int literature2 = scanner.nextInt();
            int physics2 = scanner.nextInt();
            scanner.nextLine();

            // third student
            System.out.print("Üçüncü Öğrencinin İsmi: ");
            String name3 = scanner.nextLine();
            System.out.println("Netler (Türkçe Matematik Edebiyat Fizik): ");
            int turkish3 = scanner.nextInt();
            int math3 = scanner.nextInt();
            int literature3 = scanner.nextInt();
            int physics3 = scanner.nextInt();
            scanner.nextLine();


            System.out.print("İşlemi Giriniz: ");
            String transaction = scanner.nextLine();

            if (transaction.equals("1")) {
                StudentType1 student1 = new StudentType1(turkish1, math1, literature1, physics1, name1);
                StudentType1 student2 = new StudentType1(turkish2, math2, literature2, physics2, name2);
                StudentType1 student3 = new StudentType1(turkish3, math3, literature3, physics3, name3);

                StudentType1 first = first(student1, student2, student3);

                System.out.println("Eşit Ağırlık Birinci Öğrenci: " + first.getName());
                System.out.println("Öğrencinin Puanı: " + first.gradeCalculation());
            }
            else if (transaction.equals("2")) {
                StudentType2 student1 = new StudentType2(turkish1, math1, literature1, physics1, name1);
                StudentType2 student2 = new StudentType2(turkish2, math2, literature2, physics2, name2);
                StudentType2 student3 = new StudentType2(turkish3, math3, literature3, physics3, name3);

                StudentType2 first = first(student1, student2, student3);

                System.out.println("Sayısal Birinci Öğrenci: " + first.getName());
                System.out.println("Öğrencinin Puanı: " + first.gradeCalculation());
            }
            else
                System.out.println("Geçersiz İşlem !");
        }
    }

    public static <E extends Candidate> E first(E e1, E e2, E e3) {
        if (e1.gradeCalculation() > e2.gradeCalculation() && e1.gradeCalculation() > e3.gradeCalculation())
            return e1;
        else if (e2.gradeCalculation() > e1.gradeCalculation() && e2.gradeCalculation() > e3.gradeCalculation())
            return e2;
        if (e3.gradeCalculation() > e2.gradeCalculation() && e3.gradeCalculation() > e1.gradeCalculation())
            return e3;
        else
            return e1;
    }
}
