import java.util.Scanner;

public class Main {

    public static int gcd(int num1, int num2) {
        int gcd = 1;

        for (int i = 1; i <= num1 && i <= num2 ; i++) {
            if ((num1 % i == 0) && (num2 % i == 0)) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("EBOB'unu almak istediğin 1. sayıyı gir: ");
        int num1 = scanner.nextInt();
        System.out.print("EBOB'unu almak istediğin 2. sayıyı gir: ");
        int num2 = scanner.nextInt();

        System.out.println("Sonuç = " + gcd(num1,num2));
    }
}
