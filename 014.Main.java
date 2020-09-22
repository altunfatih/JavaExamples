import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Students students = new Students();

        int grade, id, n;

        System.out.print("Kaç tane öğrenci gireceksiniz ?: ");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("ID giriniz: ");
            id = scanner.nextInt();
            System.out.print("Not giriniz: ");
            grade = scanner.nextInt();
            students.gradeAdd(id,grade);
        }
        System.out.println(students.print());
    }
}