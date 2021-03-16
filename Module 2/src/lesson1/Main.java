package lesson1;

public class Main{
    public static void main(String[] args){
//        Human person = new Human("Тренер Михаил", 15, 100, 3);
//        Robot droid = new Robot("Робот-сатанист", 25, 1000, 9);
//        Cat scp = new Cat("Meowzilla", 20, 150, 5);

        Treadmil way = new Treadmil();
        Wall wall = new Wall();

        Creature[] arr = new Creature[3];
        arr[0] = new Human("Тренер Михаил", 15, 100, 3);
        arr[1] = new Robot("Робот-сатанист", 25, 1000, 9);
        arr[2] = new Cat("Meowzilla", 20, 150, 5);

        Object[] band = new Object[3];
        band[0] = new Treadmil();
        band[1] = new Wall();
        band[2] = new Wall();

        for(int i = 0; i<3; i++){
            System.out.println(arr[i].getName() + ": ");
            for(int j = 0; j<3; j++) {
                if (band[j] instanceof Treadmil) {
                    Treadmil tmp = (Treadmil) band[j];
                    if(!arr[i].run(tmp)) break;
                } else if (band[j] instanceof Wall) {
                    Wall tmp = (Wall) band[j];
                    if(!arr[i].jump(tmp)) break;
                }
            }
        }
    }
}
