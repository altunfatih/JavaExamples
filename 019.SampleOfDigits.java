import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Examples of digits with the while loop
    }
}

class GetDigitsTest {
    public static void runCount() {
        System.out.printf("Sıfır sayısının basamak sayısı: %d%n", csd.NumberUtil.getDigitCount(0));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int val;

        while ((val = Integer.parseInt(scanner.nextLine())) != 0) {
            System.out.printf("%d sayısı %d basamaklıdır.", val, csd.NumberUtil.getDigitCount(val));
            System.out.print("\nSayı giriniz: ");
        }
    }

    public static void runSum() {
        System.out.printf("Sıfır sayısının basamaklarının toplamı %d%n", csd.NumberUtil.getDigitSum(0));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int val;

        while ((val = Integer.parseInt(scanner.nextLine())) != 0) {
            System.out.printf("%d sayısının basamaklar toplamı %d'dir", val, csd.NumberUtil.getDigitSum(val));
            System.out.print("\nSayi giriniz: ");
        }
    }

    public static void runReverse() {
        System.out.printf("Sıfır sayısının tersi: %d%n", csd.NumberUtil.getReverse(0));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int val;

        while ((val = Integer.parseInt(scanner.nextLine())) != 0) {
            System.out.printf("%d sayısının tersi %d'dir", val, csd.NumberUtil.getReverse(val));
            System.out.print("\nSayi giriniz: ");
        }
    }

    public static void runPalindrome() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int val;

        while ((val = Integer.parseInt(scanner.nextLine())) != 0) {
            if (csd.NumberUtil.isPalindrome(val))
                System.out.printf("%d sayısı bir palidromdur%n", val);
            System.out.print("Bir sayı giriniz: ");
        }
    }
}

class NumberUtil {
    public static int getDigitCount(int val) {
        if (val == 0)
            return 1;

        int count = 0;

        while (val != 0) {
            count++;
            val /= 10;
        }
        /*
        if (val != 0)
            count = (int) Math.log10(Math.abs(val)) + 1;
        */
        return count;
    }

    public static int getDigitSum(int val) {
        if (val == 0)
            return 0;

        int sum = 0;

        while (val != 0) {
            sum = val % 10 + sum;
            val /= 10;
        }
        return Math.abs(sum);
    }

    public static int getReverse(int val) {
        int numberReverse = 0;

        while (val != 0) {
            numberReverse = numberReverse * 10 + val % 10;
            val /= 10;
        }
        return numberReverse;
    }

    public static boolean isPalindrome(int val) {
        return getReverse(val) == val;
    }
}

