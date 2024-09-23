import java.util.Scanner;

public class L3T2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text");
        String text = input.nextLine().toLowerCase();
        String reversed = "";

        for(int i = text.length()-1; i >= 0;i--){
            reversed = reversed + text.charAt(i);
        }
        if (reversed.equals(text)){
            System.out.println(reversed);
            System.out.println("Is Palindrome");
        }else{
            System.out.println(reversed);
            System.out.println("Is not Palindrome");
        }
        }
    }
