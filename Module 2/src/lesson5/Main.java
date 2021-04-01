package lesson5;

public class Main extends Thread{
    static final int size = 10000000;
    static int h = size/2;



    public static void main(String[] args){
        numberOne();
        System.out.println();
        numberTwo();
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


    private static void numberTwo(){

        float[] arr = new float[size];
        for(int i = 0; i<size; i++){
            arr[i] = 1;
        }
        Calculate a1 = new Calculate(size,arr);
        Calculate a2 = new Calculate(size,arr);
        long a = System.currentTimeMillis();

        new Thread(() -> a1.calA1()).start();
        new Thread(() -> a2.calA2()).start();

        float[] arr1 = a1.getA1();
        float[] arr2 = a2.getA2();
        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);
        System.out.println(System.currentTimeMillis() - a);

    }


}
