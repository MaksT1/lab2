package lab4;

public interface Alarm {
    void alarmTurnOn(PinEvent event);
    void alarmTurnOff(PinEvent event);
    void setLogger(Logger logger);
}

