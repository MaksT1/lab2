package lab4;

public class BarsAlarm implements Alarm{
    @Override
    public void alarmTurnOn(PinEvent event) {
        System.out.println("Kraty przed sejfem zamkniete!");
    }

    @Override
    public void alarmTurnOff(PinEvent event) {
        System.out.println("Kraty od sejfu otwarte.");
    }
}
