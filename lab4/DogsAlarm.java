package lab4;

public class DogsAlarm implements Alarm{
    private Logger logger;

    @Override
    public void setLogger(Logger logger){
        this.logger = logger;
    }

    @Override
    public void alarmTurnOn(PinEvent event) {
        System.out.println("Psy wypuszczone!");
        if(logger != null){
            logger.logMessage(Severity.CRITICAL, EventSource.ALARM, "Psy zostaly spuszczone z lancuchow");
        }
    }

    @Override
    public void alarmTurnOff(PinEvent event) {
        System.out.println("Psy zamkniete w klatce.");
        if(logger != null){
            logger.logMessage(Severity.WARNING, EventSource.ALARM, "Psy wrocily do klatki");
        }
    }
}
