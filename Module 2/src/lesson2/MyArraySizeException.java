package lesson2;

public class MyArraySizeException extends Exception{
    public MyArraySizeException() throws MyArraySizeException {
        super("Некорректный размер массива");
    }
}
