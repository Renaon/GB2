package lesson1;

public class Wall {
    private int height;

    public Wall(){
        this.height = (int) ( Math.random() * 8) + 1;
    }

    public int getHeight() {
        return this.height;
    }
}
