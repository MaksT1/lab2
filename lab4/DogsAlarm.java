package lab4;

public class DogsAlarm implements Alarm{

    @Override
    public void alarmTurnOn(PinEvent event) {
        System.out.println("Psy wypuszczone!");
    }

    @Override
    public void alarmTurnOff(PinEvent event) {
        System.out.println("Psy zamkniete w klatce.");
    }
}
