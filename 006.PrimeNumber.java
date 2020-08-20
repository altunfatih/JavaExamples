import java.util.Scanner;

public class Main {

    public static boolean primeNum(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                System.out.println("Asal Bir Sayı Değil!");
                return false;
            }
        }
        System.out.println("Asal Bir Sayı!");
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int num = scanner.nextInt();

        primeNum(num);
    }
}