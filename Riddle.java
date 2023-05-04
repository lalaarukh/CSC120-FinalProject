import java.util.Random;
import java.util.Scanner;

public class Riddle {
    public static int run(int score) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

        String[][] qs = {
            {"I'm tall when I'm young and I'm short when I'm old. What am I?", "Candle"},
            {"What is 3/7 chicken, 2/3 cat, and 2/4 goat?", "Chicago"},
            {"I have a head like a cat and feet like a cat, but I am not a cat. What am I?", "Kitten"},
            {"I speak without a mouth and hear without ears. I have no body, but I come alive with the wind. What am I?", "Echo"},
            {"I have cities, but no houses. I have mountains, but no trees. I have water, but no fish.", "Map"},
            {"What has a neck but no body?", "Bottle"},
            {"Which fish costs the most?", "Goldfish"},
            {"If you're holding a bee, what do you have in your eye?", "Beauty"},
            {"What goes up, but never goes down?", "Age"},
            {"What has to be broken before you can use it?", "Egg"}
        };
        
        Random rand = new Random();
        int ind = rand.nextInt(10);
        String[] sel_tup = qs[ind];
        System.out.println("Question: " + sel_tup[0]);
        
        Scanner scanner = new Scanner(System.in);
        String ans = scanner.nextLine().trim().toLowerCase();
        ans = ans.substring(0, 1).toUpperCase() + ans.substring(1);
        
        if (ans.equals(sel_tup[1])) {
            System.out.println("\nWoohoo!");
            score++;
            System.out.println("\nYour Score is: " + score + "\n");
        } else {
            System.out.println("\nNope, Answer: " + sel_tup[1]);
            System.out.println("\nYour Score is: " + score + "\n");
        }
        return score;
    }
    
    public static void main(String[] args) {
        int score = 0;
        while (true) {
            score = riddle(score);
        }
    }
    
    
}
