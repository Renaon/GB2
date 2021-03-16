package lesson1.enumexircise;

public enum DayOfWeek {
    SUNDAY("Воскресенье", 0), SATURDAY("Суббота", 0),
     FRIDAY("Пятница", 0), THURSDAY("Четверг", 8),
    WEDNSDAY("Среда", 8), TUESDAY("Вторник", 8),
    MONDAY("Понедельник", 8);
    
    private String russianTitle;
    private int hours;

    DayOfWeek(String russianTitle, int hours) {
        this.russianTitle = russianTitle;
        this.hours = hours;
    }

    public int getHours(){
        return this.hours;
    }
}
