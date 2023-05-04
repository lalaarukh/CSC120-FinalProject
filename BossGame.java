import java.util.Random;
import java.util.Scanner;

public class BossGame {
    
    public static int boss() {
        int score = 0;
        int length = 3;
        int chances = 3;
        int pattern = new Random().nextInt(9000) + 1000;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Give me your best guess! You have " + chances + " left: ");
        int guess = input.nextInt();
        
        if (guess == pattern) {
            System.out.println("Wow, I can't believe you cracked the code! YOU BEAT THE BOSS!");
            score = score + 4;
            System.out.println("Your final score is: " + score);
        } else {
            while (guess != pattern && chances != 1) {
                chances--;
                System.out.print("Give me your best guess! You have " + chances + " left: ");
                guess = input.nextInt();
                if (guess == pattern) {
                    System.out.println("Wow, I can't believe you cracked the code! YOU BEAT THE BOSS!");
                    score = score + 4;
                }
            }
            if (chances == 1 && pattern != guess) {
                System.out.println("Oh no, you didn't crack the code! The answer is " + pattern);
            }
        }
        
        System.out.println("Your score after the boss is: " + score);
        return score;
    }
    
    public static void main(String[] args) {
        boss();
    }
}
