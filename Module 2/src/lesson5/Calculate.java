package lesson5;

public class Calculate {
    final int h;
    private float a1[];
    private float a2[];

    public Calculate(int size){
        this.h = size/2;
        this.a1 = new float[h];
        this.a2 = new float[h];

    }

    public void delTwo(float[] arr){
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

    }
}
