import java.util.Scanner;
import java.util.Random;
import java.lang.String;
 
/**
 *  This class has the main class which calls on the other classes. The other classes have the gameplay and this
 * class has the scoring system. There are also while loops to ensure the right amount of rounds are run.
 */
public class BadBoniAdventureGame {

    public static void main(String[] args) {

        int score = 0;
        int roundnumber = 1;
    
        //Where the storyline starts 
        System.out.println("Welcome to the Bad Boni Adventure Game!");
        System.out.println("In this game, you want to save Bad Bunny from Elvis Crespo!!\n");
        System.out.println("To do that, you have to beat 2 bridge trolls and then THEIR BOSS. Each round has a certain number of points, you need to get 8 total to win!\n");
        System.out.println("Let us begin!");

        //Ask for basic information by calling on the Player class
        Player player = new Player();
        player.getInfo();
        System.out.println("Welcome, " + player.getInfo() + "!");
        System.out.println("\nTo beat the first bridge troll, you must answer 3 riddles correctly. Sharpen those teeth!\n");

        //calls riddle function and runs it 3 times in a while loop
        while (roundnumber <= 3) {
            score = Riddle.run(score);
            roundnumber += 1;
        }
        if (score == 3) {
            System.out.println("\nGreat Job! That troll had no idea what was coming for him. Unfortunately, his brother remains and is vengeful. He is going to ask you some gross math questions so buckle up!");
        } else {
            System.out.println("\nUh oh. You did not get all 3 right but that is okay! You get another chance at beating his brother. Time to pull out those rad math skillz");
        }
    
        System.out.println("\nHere it comes! Make sure to answer in numbers(1,2,3..) and not letters(one, two, three)\n");

        //calls math function and runs it 3 times in a while loop
        
        while (roundnumber <= 6) {
            score = MathGame.run(score);
            roundnumber += 1;
        }
        if (score == 6) {
            System.out.println("\nYou are too good at this. Look at you winning! One last hurdle and Bad Bunny will be safe. Now you have to beat the scariest of the trolls, the BOSS! Good luck :)");
        } else {
            System.out.println("\nMeep morp. You didn't do great here but that's okay! Bring out the skills you have been hiding and bare your claws; it's time to fight the BOSS!");
        }
        System.out.println("\nTo do this, you have to guess a combination of three numbers");
    
        //calls the boss class
        // the boss function itself gives you 3 chances but it counts as 1 round
        while (roundnumber <= 7){
            score += BossGame.boss();
            roundnumber += 1;
        }

        //determines the final standing of the player
        if (score >= 8) {
            System.out.println("Your total score is " + score + ". You won!");
        } else {
            System.out.println("Your total score is " + score + ". You got so close! Try again soon, the trolls await :)");
        }
    }
}

    