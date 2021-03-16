package lesson1;

public class Cat implements Creature{
    private String name;
    private int speed;
    private int stamina;
    private int jump_height;
    public Cat(String name, int speed, int stamina, int jump_height){
        this.name = name;
        this.speed = speed;
        this. stamina = stamina;
        this.jump_height = jump_height;
    }

    @Override
    public boolean run(Treadmil way) {
        if(this.speed > way.getSpeed() && this.stamina > way.getLen()){
            System.out.println("Пробежал");
            return true;
        }
        else{
            System.out.println("Не осилил");
            return false;
        }
    }

    @Override
    public boolean jump(Wall wall) {
        if (this.jump_height> wall.getHeight()){
            System.out.println("Перепрыгнул");
            return true;
        }
        else{
            System.out.println("Не смог");
            return false;
        }
    }

     @Override
    public String getName() {
        return this.name;
    }
}
