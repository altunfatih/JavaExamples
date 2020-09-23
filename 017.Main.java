package untitled1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student(4, "Fatih");
        Student student2 = new Student(2, "Ömer");
        Student student3 = new Student(3, "Büşra");

        Student[] students = {student1, student2, student3};

        System.out.println("Dizi sıralamadamn önceki hali");
        for (Student value : students) {
            System.out.println(value);
        }

        Arrays.sort(students);
        System.out.println("Dizi sıralamadamn sonraki hali");
        for (Student value : students) {
            System.out.println(value);
        }
    }
}
