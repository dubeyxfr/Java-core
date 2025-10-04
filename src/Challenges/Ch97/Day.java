package Challenges.Ch97;

public enum Day {
    MONDAY(true),
    THUESDAY(true),
    WEDNESDAY(true),
    THRUESDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);
    private final boolean isWeekday;

    Day(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }
    public String getType(){
        return isWeekday ? "Weekday" : "Weekend";
    }
}
