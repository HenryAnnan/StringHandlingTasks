import java.util.Scanner;
public class L2T2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String");
        String inputString = input.nextLine().toLowerCase();
        int stringLength = inputString.length();

        for (int i = stringLength -1;i >= 0; i-- ){
            System.out.print(inputString.charAt(i));
        }

    }
}
