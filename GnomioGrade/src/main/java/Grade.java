import java.util.Scanner;

public class Grade{
    public static void main(String[] args) {
        double score = 0;

/** Prompt user for a score
 * The input should be a number
 * The input should not be null
 * */
        Scanner console = new Scanner(System.in);
        try {
            System.out.println ("Enter your score between 0.0 and 1.0 : ");
            score = Double.parseDouble (console.nextLine ( ));
            if (console.hasNextLine ()) {
                console.nextLine();
            }
        } catch (NumberFormatException e) {
            System.out.println("input must not be null / must be a score between 0.0 and 1.0");
            System.out.println(e);
        }

/** print the grade if the input is not null and is numeric
 *  and between 0.0 and 1.0,
 *  else give helpful error message.
 */
        try {
            if (score >= 0.9 && score <= 1.0) {
                System.out.println (score + "\n "+ "A");
            } else if (score >= 0.8 && score <= 0.9) {
                System.out.println (score + "\n "+ "B");
            } else if (score >= 0.7 && score < 0.8) {
                System.out.println (score + "\n "+ "C");
            } else if (score >= 0.6 && score <0.7) {
                System.out.println (score + "\n "+ " D");
            } else if (score >= 0.0 && score < 0.6) {
                System.out.println (score + "\n "+ "F");
            }
            else {
                System.out.println("Your score is out of range. Please enter a valid score between 0.0 and 1.0");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}