import java.util.Random;
import java.util.Scanner;

/**
 * This class has an array of strings which are the math questions called upon in round 2 of the game. It outputs
 * a question and keeps track of the user answer (if they are getting it correct and updating the score).
 */
public class MathGame {

    // this function takes in the answers that players put in and updates score accordingly
    public static int run(int score) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[][] questions = {
                {"If there are 4 apples and you take away 3, how many do you have?", "1"},
                {"If eggs are $0.12 a dozen, how many eggs can you get for a dollar?", "100"},
                {"When Mitch was 6 years old, his little sister, Lila, was half his age. If Mitch is 40 years old today, how old is Lila?", "37"},
                {"How many days are there in 4 years?", "1461"},
                {"You are given 3 positive numbers. You can add these numbers and multiply them together. The result you get will be the same. Which are the numbers?", "1,2,3"},
                {"If you multiply this number by any other number, the answer will always be the same. What number is this?", "0"},
                {"I am an odd number; take away an alphabet, and I become even. What number am I?", "7"},
                {"If it were two hours later, it would be half as long until midnight as it would be if it were an hour later. What time is it now?", "9"},
                {"If 2 is company and 3 is a crowd, what are 4 and 5?", "9"}
        };
        int ind = rand.nextInt(10);
        String[] selInd = questions[ind];

        //print questions and take in answer
        System.out.println("Question: " + selInd[0]);
        System.out.println("Give me your answer: ");

        //format answer to match given answer
        String ans = sc.nextLine().trim().toLowerCase();

        //check if answer is correct
        if (ans.equals(selInd[1].toLowerCase())) {
            System.out.println("Woohoo!");
            score += 1;
            System.out.println("Your Score is: " + score + "\n");
        } else {
            System.out.println("Nope, Answer: " + selInd[1]);
            System.out.println("Your Score is: " + score);
        }
        return score;
    }
}
