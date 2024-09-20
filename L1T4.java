import java.util.Scanner;

public class L1T4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Name");
        String name = input.nextLine();

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                String firstName = name.substring(0, i);
                String surname = name.substring(i + 1);
                System.out.println("Hello " + firstName);
                System.out.println("Hello " + surname);
            }
        }
    }
}