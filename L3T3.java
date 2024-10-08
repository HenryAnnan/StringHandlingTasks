import java.util.Scanner;

public class L3T3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ISBN");
        String ISBN = input.nextLine();
        int sum = 0;

        if (ISBN.length() == 13) {
            char providedCheckChar = ISBN.charAt(12);
            int providedCheckInt = Character.getNumericValue(providedCheckChar);

            for (int i = 0; i < 12; i++) {
                int num = Character.getNumericValue(ISBN.charAt(i));
                if (i % 2 == 0) {
                    sum += num;
                } else {
                    sum += num * 3;
                }
            }

            int calculatedCheck = (10 - (sum % 10)) ;
            if (calculatedCheck == 10){
                calculatedCheck = 0;
            }

            if (providedCheckInt == calculatedCheck) {
                System.out.println("ISBN validated");
            } else {
                System.out.println("ISBN NOT validated");
                System.out.println("Check digit should be: " + calculatedCheck + " Your check digit was: " + providedCheckInt);
            }
        } else {
            System.out.println("Your ISBN is not of the correct length");
        }
    }
}