import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String id = "admin";
        String pass = "admin123";
        int entry = 3;

        System.out.println("*********** Kullanıcı Giriş Formuna Hoşgeldiniz ***********");

        while (true)
        {
            System.out.print("Kullanici Adinizi Giriniz: ");
            String answer_id = scanner.next();
            System.out.print("Şifrenizi Giriniz: ");
            String answer_pass = scanner.next();

            if (id.equals(answer_id) && pass.equals(answer_pass)){
                System.out.println("Başarılı Bir Şekilde Giriş Yaptınız...");
                break;
            }
            else {
                System.out.println("Kullanıcı Adı veya Şifren Yanlış!! \n");
                System.out.print("Kalan Giriş Hakkınız = " + (entry - 1) + "\n");
                entry--;
                if (entry == 0){
                    break;
                }
            }
        }

    }
}