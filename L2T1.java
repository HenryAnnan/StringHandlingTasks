import java.util.Scanner;
public class L2T1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Phrase");
        String phrase = input.nextLine();
        int words = 1 ;
        for (int i = 0; i < phrase.length(); i++){
            if (phrase.charAt(i) == ' '){
                words++;
            }
        }
            System.out.println("Your phrase has " + words + " words");
    }
}
