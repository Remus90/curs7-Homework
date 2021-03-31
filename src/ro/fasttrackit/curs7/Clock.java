package ro.fasttrackit.curs7;

public class Clock {

    //class  - fields
    public static String TIP = "MAMA";
    //state
    private int hour;
    private int minutes;

    public Clock(int hour) {
        this(hour, 0);

    }

    public Clock(int hour, int minutes) {
        setHour(hour);
        setMinutes(minutes);

    }

    String readTime() {
        return printTimeElement(hour) + ":" + printTimeElement(minutes);
    }

    private String printTimeElement(int number) {

        if (number < 10) {
            return "0" + number;
        } else {
            return "" + number;
        }
    }

    public void addMinutes(int minutes) {
        if (minutes > 0) {
            int newMinutes = this.minutes + minutes;
            setHour(this.hour + minutes / 60);
            this.hour = this.hour + newMinutes / 60;
            this.minutes = newMinutes % 60;

        }
    }

    int getHour() {
        return hour;
    }

    int getMinutes() {
        return minutes;
    }

    void setHour(int newHour) {
        if (newHour < 0) {
            hour = 0;
        } else if (newHour > 23) {
            hour = 23;
        } else {
            hour = newHour;
        }
    }

    void setMinutes(int minutes) {
        if (minutes < 0) {
            this.minutes = 0;
        } else if (minutes >= 60) {
            this.minutes = 59;
        } else {
            this.minutes = minutes;
        }
    }
    public static void present(){
        System.out.println(TIP);
    }
}

