import java.util.Scanner;
public class L1T5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First name, Middle name and Last name");
        String fullName = input.nextLine();

        System.out.print(fullName.charAt(0));
        for (int i = 0; i<fullName.length();i++){
            if (fullName.charAt(i) == ' '){
                System.out.print(fullName.charAt(i+1));
            }
        }
    }
}
