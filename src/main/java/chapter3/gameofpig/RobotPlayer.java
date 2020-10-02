package chapter3.gameofpig;

public class RobotPlayer extends Player {

    public RobotPlayer(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        Die die = new Die(6);
        int partialScore = 0;

        while (partialScore < 20){
            int rolled = die.roll();
            if(rolled == 1){
                partialScore = 0;
                break;
            }

            partialScore = partialScore + rolled;
        }

        score = score + partialScore;
    }
}
