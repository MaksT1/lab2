package lab4;

public class SoundAlarm implements Alarm{
    private Logger logger;

    @Override
    public void setLogger(Logger logger){
        this.logger = logger;
    }

    @Override
    public void alarmTurnOn(PinEvent event){
        System.out.println("ALARM DZWIEKOWY WLACZONY!!!!");
        if(logger != null){
            logger.logMessage(Severity.WARNING, EventSource.ALARM, "Uruchomiono alarm dzwiekowy");
        }
    }

    @Override
    public void alarmTurnOff(PinEvent event) {
        System.out.println("Alarm dzwiekowy wylaczony");
        if(logger != null){
            logger.logMessage(Severity.INFO, EventSource.ALARM, "Wylaczono alarm dzwiekowy");
        }
    }
}
