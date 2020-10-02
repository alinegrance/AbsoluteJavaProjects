package chapter3.gameofpig;

import java.util.Scanner;

public class HumanPlayer extends Player {

    public HumanPlayer(String name){
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("It's " + name + "'s turn");

        int partialScore = 0;
        boolean wantContinue = true;
        Die die = new Die(6);


        while (wantContinue) {
            int rolled = die.roll();
            System.out.println("You rolled " + rolled);

            if (rolled == 1) {
                partialScore = 0;
                break;
            }
            partialScore = partialScore + rolled;

            System.out.print("Enter 'r' to roll again or 'h' to pass: ");

            char choice;
            do {
                Scanner scan = new Scanner(System.in);
                choice = scan.next().charAt(0);

            } while(choice != 'r' && choice != 'h' );

            if (choice == 'h'){
                wantContinue = false;
            }
        }

        score = score + partialScore;
    }
}
