package chapter3.gameofpig;

import java.util.Random;

public class Die {
    private int sides;

    public Die(int sides){
        this.sides = sides;
    }

    public int roll(){
        Random random = new Random();

        return random.nextInt(sides) + 1;
    }
}
