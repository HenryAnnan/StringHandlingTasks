import java.util.Scanner;
public class L2T3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Phrase");
        String phrase = input.nextLine();
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < phrase.length();i++){

            if (phrase.charAt(i) != ' '){
                switch (phrase.charAt(i)) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        vowels++;
                        break;
                    default:
                        consonants++;
                        break;
                }
            }

        }
        System.out.println(vowels + " Vowels and " + consonants + " consonants");
    }
}
