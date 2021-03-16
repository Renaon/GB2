package lesson1.enumexircise;

import static lesson1.enumexircise.DayOfWeek.*;

public class DayOfWeekMain {
    public static void main(String[] args) {
        System.out.println(getWorkingHours(DayOfWeek.MONDAY));
 }

 private static String getWorkingHours(DayOfWeek day){
        int tmp = 0;
        if(day == DayOfWeek.SUNDAY || day == DayOfWeek.SATURDAY) return "Выходной";
        for(DayOfWeek key: DayOfWeek.values()){
            tmp += key.getHours();
            if(day == key) break;
        }
        String remained = tmp + "";
        return remained;
 }
}
