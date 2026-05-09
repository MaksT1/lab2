package lab4;

public class PoliceAlarm implements Alarm{
    private Logger logger;

    @Override
    public void setLogger(Logger logger){
        this.logger = logger;
    }
    @Override
    public void alarmTurnOn(PinEvent event) {
        System.out.println("Dzwonienie do policji... ... Policja w drodze");
        if(logger != null){
            logger.logMessage(Severity.CRITICAL, EventSource.ALARM, "Zgloszenie wydane policji!");
        }
    }

    @Override
    public void alarmTurnOff(PinEvent event) {
        System.out.println("Zgloszenie zostalo odwolane");
        if(logger != null){
            logger.logMessage(Severity.INFO, EventSource.ALARM, "Zgloszenie policji odwolane");
        }
    }
}
