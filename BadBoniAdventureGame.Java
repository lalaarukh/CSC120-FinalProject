import java.util.Scanner;
import java.util.Random;
import java.lang.String;

public class BadBoniAdventureGame {

    public static void main(String[] args) {
    
        //Where the storyline starts 
        System.out.println("Welcome to the Bad Boni Adventure Game!");
        System.out.println("In this game, you want to save Bad Bunny from Elvis Crespo!!\n");
        System.out.println("To do that, you have to beat 2 bridge trolls and then THEIR BOSS. Each round has a certain number of points, you need to get 8 total to win!\n");
        System.out.println("Let’s begin!");

        //Ask for basic information 
        Player player = new Player();
        player.getInfo();
        System.out.println("\nTo beat the first bridge troll, you must answer 3 riddles correctly. Sharpen those teeth!\n");
        //calls riddle function and runs it 3 times
        //Point-system 
        int score = 0;
        int roundnumber = 1;
        while (roundnumber <= 3) {
            score = Riddle.run(score);
            roundnumber += 1;
        }
        if (score == 3) {
            System.out.println("\nGreat Job! That troll had no idea what was coming for him. Unfortunately, his brother remains and is vengeful. He’s going to ask you some gross math questions so buckle up!");
        } else {
            System.out.println("\nUh oh. You didn’t get all 3 right but that’s okay! You get another chance at beating his brother. Time to pull out those rad math skillz");
        }
    
        System.out.println("\nHere it comes!\n");
        //calls math function and runs it 3 times
        //Point-system 
        while (roundnumber <= 6) {
            score = MathGame.run(score);
            roundnumber += 1;
        }
        if (score == 6) {
            System.out.println("\nYou are too good at this. Look at you winning! One last hurdle and Bad Bunny will be safe. Now you have to beat the scariest of the trolls, the BOSS! Good luck :)");
        } else {
            System.out.println("\nMeep morp. You didn't do great here but that's okay! Bring out the skills you’ve been hiding and bare your claws; it's time to fight the BOSS!");
        }
        System.out.println("\nTo do this, you have to guess a combination of four numbers");
    
        //calls the running function which is the BOSS and runs it 4 times
        //Point-system
        // while roundnumber <= 10: 
        roundnumber += 1;
        score += BossGame.run();
        System.out.println(score);
        if (score >= 8) {
            System.out.println("You won!");
        } else {
            System.out.println("boohoo loser");
        }
    }
}
    