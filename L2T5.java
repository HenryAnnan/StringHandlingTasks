import java.util.Scanner;

public class L2T5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String WORD = "RANDOM";
        boolean l1Correct = false;
        boolean l2Correct = false;
        boolean l3Correct = false;
        boolean l4Correct = false;
        boolean l5Correct = false;
        boolean l6Correct = false;

        System.out.println("______");
        while (!l1Correct){
            System.out.println("Select Letter 1");
            String guess = input.nextLine().toLowerCase();
            if (guess.equals("r")){
                System.out.println("R_____");
                l1Correct = true;
            }else {
                System.out.println("?______");
            }
        }
        while (!l2Correct){
            System.out.println("Select Letter 2");
            String guess = input.nextLine().toLowerCase();
            if (guess.equals("a")){
                System.out.println("RA____");
                l2Correct = true;
            }else {
                System.out.println("R?_____");
            }
        }
        while (!l3Correct){
            System.out.println("Select Letter 3");
            String guess = input.nextLine().toLowerCase();
            if (guess.equals("n")){
                System.out.println("RAN___");
                l3Correct = true;
            }else {
                System.out.println("RA?___");
            }
        }
        while (!l4Correct){
            System.out.println("Select Letter 4");
            String guess = input.nextLine().toLowerCase();
            if (guess.equals("d")){
                System.out.println("RAND__");
                l4Correct = true;
            }else {
                System.out.println("RAN?__");
            }
        }
        while (!l5Correct){
            System.out.println("Select Letter 5");
            String guess = input.nextLine().toLowerCase();
            if (guess.equals("o")){
                System.out.println("RANDO_");
                l5Correct = true;
            }else {
                System.out.println("RAND?_");
            }
        }
        while (!l6Correct){
            System.out.println("Select Letter 6");
            String guess = input.nextLine().toLowerCase();
            if (guess.equals("m")){
                System.out.println("RANDOM");
                l6Correct = true;
            }else {
                System.out.println("RANDO?");
            }
        }
    }
}
