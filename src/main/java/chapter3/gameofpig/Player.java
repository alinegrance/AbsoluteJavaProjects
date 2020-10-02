package chapter3.gameofpig;

public abstract class Player {
    protected int score = 0;
    protected String name;

    public abstract void play();

    public int getScore(){
        return this.score;
    }

    public String getName(){
        return this.name;
    }
}
