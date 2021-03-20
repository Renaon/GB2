package lesson2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        int result = createArr(4);
        System.out.println(result);
    }

    private static int createArr(int size) throws MyArraySizeException, MyArrayDataException {
        if ( size>4) throw new MyArraySizeException();
        String[][] arr = new String[size][size];
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i< arr.length; i++){
            for(int j = 0; j< arr.length;j++) {
                arr[i][j] = scan.nextLine();
            }
        }

        for (int i = 0; i< arr.length; i++){
            for(int j = 0; j< arr.length;j++) {
               try{
                   sum += Integer.parseInt(arr[i][j]);
               }catch (NumberFormatException e) {
                   throw new MyArrayDataException(i,j);
               }

            }
        }

        return sum;
    }
}
