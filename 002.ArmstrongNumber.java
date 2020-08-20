import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayıyı Giriniz: ");
        int number = scanner.nextInt();
        System.out.print("Basamak Sayısını Giriniz: ");
        int number_digits = scanner.nextInt();

        int temp = number;
        int total = 0;

        do {
            int digit_value = temp % 10;
            temp /= 10;
            total += Math.pow(digit_value, number_digits);
        }while (temp > 0);

        if (number == total){
            System.out.println("Bu sayı bir armstrong sayısıdır...");
        }
        else {
            System.out.println("Bu sayı bir armstrong sayısı değildir...");
        }
    }
}