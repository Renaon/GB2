package lesson1;

public class Treadmil {
    private int len;
    private int speed;

    public Treadmil(){
        this.len = (int) ( Math.random() * 100) + 1;
        this.speed = (int) ( Math.random() * 17) + 1;
    }

    public int getLen() {
        return this.len;
    }

    public int getSpeed() {
        return this.speed;
    }
}
