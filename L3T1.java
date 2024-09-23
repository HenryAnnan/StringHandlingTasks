import java.util.Scanner;
public class L3T1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Message");
        String message = input.nextLine();
        System.out.println("Enter Key");
        int key = input.nextInt();
        String encrypted = "";

        for(int i = 0; i < message.length(); i++){
            int asciiValue = message.charAt(i);
            asciiValue = asciiValue + key;
            char character = (char) asciiValue;
            encrypted = encrypted + character;

        }
        System.out.println(encrypted);
    }
}
