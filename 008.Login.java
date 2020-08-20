import java.util.Scanner;

public class Login {
    public boolean login(Account account) {
        Scanner scanner = new Scanner(System.in);
        String id, pass;

        System.out.print("Kullanıcı Adı: ");
        id = scanner.next();
        System.out.print("Parola: ");
        pass = scanner.next();

        if (account.getId().equals(id) && account.getPass().equals(pass)){
            return true;
        }
        else {
            return false;
        }
    }
}
