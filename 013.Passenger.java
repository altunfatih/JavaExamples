import java.util.Scanner;

public class Passenger implements IRules {
    private int fee;
    private boolean political;
    private boolean visa;

    public Passenger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yatırdığınız Harç Bedeli ?: ");
        this.fee = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Herhangi bir siyasi yasağınız bulunuyor mu ? (evet/hayır): ");
        String answer = scanner.nextLine();

        if (answer.equals("evet"))
            this.political = true;
        else
            this.political = false;

        System.out.print("Vizeniz bulunuyor mu ? (evet/hayır): ");
        String answer2 = scanner.nextLine();

        if (answer2.equals("evet"))
            this.visa = true;
        else
            this.visa = false;
        System.out.println("\n");
    }

    @Override
    public boolean abroad_fee_control() {
        if (this.fee < 15) {
            System.out.println("Lütfen yurtdışı çıkış harcını tam yatırınız...");
            return false;
        }
        else {
            System.out.println("Yurtdışı harc işlemi tamamlanmıştır.");
            return true;
        }
    }

    @Override
    public boolean political_control() {
        if (this.political == true) {
            System.out.println("Siyasi yasağınız bulunuyor. Yurtdışına çıkamazsınız");
            return false;
        }
        else {
            System.out.println("Siyasi yasağınız bulunmuyor...");
            return true;
        }
    }

    @Override
    public boolean visa_control() {
        if (this.visa == true) {
            System.out.println("Vize işlemleri tamam.");
            return true;
        }
        else {
            System.out.println("Vizeniz bulunmamaktadır.");
            return false;
        }
    }
}
