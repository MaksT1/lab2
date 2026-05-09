package lab4;

public class Main {
    public static void main(String[] args){
        Safe safe = new Safe("5781");

        Logger consolelog = new ConsoleLogger(Severity.INFO);
        Logger filelog = new FileLogger(Severity.WARNING, "safe_alarm.log");

        Alarm soundAlarm = new SoundAlarm();
        soundAlarm.setLogger(consolelog);

        Alarm dogsAlarm = new DogsAlarm();

        Alarm policeAlarm = new PoliceAlarm();
        policeAlarm.setLogger(filelog);

        Alarm barsAlarm = new BarsAlarm();
        barsAlarm.setLogger(filelog);

        safe.addAlarm(policeAlarm);
        safe.addAlarm(soundAlarm);
        safe.addAlarm(dogsAlarm);
        safe.addAlarm(barsAlarm);

        safe.enterPin("1111");

        safe.enterPin("5781");

        safe.removeAlarm(barsAlarm);
        safe.enterPin("1833");


    }
}
