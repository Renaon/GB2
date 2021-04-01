package lesson5;

public class Calculate{
    final int h;
    private final float a1[];
    private final float a2[];
    private int size;
    private final float[] arr;



    public Calculate(int size,float[] arr ){
        this.size = size;
        this.h = size/2;
        this.a1 = new float[h];
        this.a2 = new float[h];
        this.arr = arr;
    }

    public synchronized void calA1(){

        System.arraycopy(arr, h, a2, 0, h);
        for(int i = 0; i<h; i++){
            a2[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    public synchronized void calA2(){
        System.arraycopy(arr, 0, a1, 0, h);
        for(int i = 0; i<h; i++){
            a1[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    public float[] getA1() {
        return a1;
    }

    public float[] getA2() {
        return a2;
    }
}
