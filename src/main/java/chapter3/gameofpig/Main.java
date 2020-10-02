package chapter3.gameofpig;

public class Main {

    public static void main(String[] args) {
        Player player1 = new HumanPlayer("Alien");
        Player player2 = new HumanPlayer("Kazuki");
        int turn = 1;
        boolean isGameOver = false;

        while(!isGameOver) {
            System.out.println(">>> Turn: " + turn);

            player1.play();
            System.out.println(player1.getName() + ": " + player1.getScore());

            if(player1.getScore() >= 100){
                isGameOver = true;
            }

            if(!isGameOver) {
                player2.play();
                System.out.println(player2.getName() + ": " + player2.getScore());

                if(player2.getScore() >= 100){
                    isGameOver = true;
                }
            }

            turn++;
        }

        Player winner = player1.getScore() > player2.getScore() ? player1 : player2;
        Player loser = player1.getScore() > player2.getScore() ? player2 : player1;

        System.out.println("The winner is: " + winner.getName() + ", with " + winner.getScore() + " points.");
        System.out.println("The other player is: " + loser.getName() + ", with " + loser.getScore() + " points.");
    }
}
