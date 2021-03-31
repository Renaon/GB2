package lesson5;

public class Main extends Thread{
    static final int size = 10000000;



    public static void main(String[] args){

    }

    private static void numberOne(){
        float[] arr = new float[size];
        for(int i = 0; i<size; i++){
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();
        for(int i = 0; i<size; i++){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - a);
    }

    @Override
    public void run(){

    }

    private static void numberTwo(){
        float[] arr = new float[size];



    }
}
