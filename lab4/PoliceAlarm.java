package lab4;

public class PoliceAlarm implements Alarm{
    @Override
    public void alarmTurnOn(PinEvent event) {
        System.out.println("Dzwonienie do policji... ... Policja w drodze");
    }

    @Override
    public void alarmTurnOff(PinEvent event) {
        System.out.println("Zgloszenie zostalo odwolane");
    }
}
