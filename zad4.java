
class Clock{
    private int hours;
    private int minutes;
    private int seconds;
    Clock(){
        hours = 12;
        minutes = 0;
        seconds = 0;
    }
    Clock(int hours, int minutes, int seconds){
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }
    Clock(int secondsSinceMid){
        if(secondsSinceMid < 0 ){
            secondsSinceMid = 0;
        }
        secondsSinceMid = secondsSinceMid % 86400;
        this.hours = secondsSinceMid / 3600;
        secondsSinceMid %= 3600;
        this.minutes = secondsSinceMid / 60;
        this.seconds = secondsSinceMid % 60;
    }
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours <= 23) {
            this.hours = hours;
        } else {
            System.out.println("Błąd");
            this.hours = 0;
        }
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes <= 59) {
            this.minutes = minutes;
        } else {
            System.out.println("Błąd");
            this.minutes = 0;
        }
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds <= 59) {
            this.seconds = seconds;
        } else {
            System.out.println("Błąd");
            this.seconds = 0;
        }
    }
    public void tick(){
        seconds++;
        if(seconds > 59){
            seconds = 0;
            minutes++;
            if(minutes > 59){
                minutes = 0;
                hours++;
                if(hours > 23){
                    hours = 0;
                }
            }
        }
    }
    public void tickDown(){
        seconds--;
        if(seconds < 0){
            seconds = 59;
            minutes--;
            if(minutes < 0){
                minutes = 59;
                hours--;
                if(hours < 0){
                    hours = 23;
                }
            }
        }
    }
    public String toString(){
        return String.format("[%02d:%02d:%02d]", hours, minutes, seconds);
    }
}

public class zad4 {
    public static void main(String[] args){
        Clock c1 = new Clock();
        System.out.println(c1.toString());
        Clock c2 = new Clock(22, 3, 15);
        System.out.println(c2.toString());
        Clock c3 = new Clock(3600);
        System.out.println(c3.toString());
        c2.tick();
        System.out.println(c2.toString());
        c1.tickDown();
        System.out.println(c1.toString());
    }
}
