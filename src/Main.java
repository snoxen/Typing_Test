import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Game game = new Game();
        Scanner sc = new Scanner(System.in);
        System.out.println("For how many words would you like to play?");
        int numberOfWords = sc.nextInt();

        game.play(numberOfWords);
    }

}
