import java.util.Objects;
import java.util.Scanner;

public class level2 {
    public static void main(String[] args) {

        String password1 = "Password1";
        String password2 = "Password2";

        while (!password1.equals(password2)){
            Scanner input = new Scanner(System.in);
            System.out.println("Password");
            password1 = input.nextLine();

            System.out.println("Repeat Password");
            password2 = input.nextLine();
        }
        System.out.println("Passwords Verified");
    }
}