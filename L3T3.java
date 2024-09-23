import java.util.Scanner;

public class L3T3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ISBN");
        String ISBN = input.nextLine();
        int caluclatedCheck = 0;
        int sum = 0;

            for (int i =0; i< 12; i++){
                if(i == 1 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 13){
                    char c = ISBN.charAt(i);
                    int num = Character.getNumericValue(c);
                    sum = sum+num;

                }else {
                    char c = ISBN.charAt(i);
                    int num = Character.getNumericValue(c);
                    int calc = num*3;
                    sum = sum + calc;
                }



            }
        int modulusResult = sum%10;
            if (modulusResult != 0){
                caluclatedCheck = 10-modulusResult;
            }
            char lastChar = ISBN.charAt(12);
            int num = Character.getNumericValue(lastChar);
            if (num == caluclatedCheck){
                System.out.println("Valid ISBN");
            }else{
                System.out.println("Invalid ISBN");
                System.out.println("Your check digit is: " + num + " It should have been "+ caluclatedCheck);
            }
        }

        }

