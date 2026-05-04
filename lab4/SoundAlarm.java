package lab4;

public class SoundAlarm implements Alarm{
    @Override
    public void alarmTurnOn(PinEvent event){
        System.out.println("ALARM DZWIEKOWY WLACZONY!!!!");
    }

    @Override
    public void alarmTurnOff(PinEvent event) {
        System.out.println("Alarm dzwiekowy wylaczony");
    }
}
