import java.util.Scanner;

public class L1T1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("First Name");
        String firstName = input.nextLine();

        System.out.println("Second Name");
        String secondName = input.nextLine();

        String combined = firstName + secondName;
        System.out.println(combined);
    }
}