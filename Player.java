import java.util.Scanner;

public class Player {

    private String name;

    public Player() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        this.name = scanner.nextLine();
        System.out.println("Name: " + this.name);
    }

    public String getInfo(){
        return this.name;
    }

}
