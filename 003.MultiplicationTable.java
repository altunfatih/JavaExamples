public class Main {

    public static void main(String[] args) {

        System.out.println("Çarpım tablosuna hoşgeldiniz...");
        int number = 1, total;

        for (int i = 1; i < 11; i++) {

            for (int j = 1; j < 11; j++) {
                total = j * i;
                System.out.println(i + " x " + j + " =" + total);
            }
            System.out.println("*****************");
        }
    }
}