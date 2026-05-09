package lab4;

public class BarsAlarm implements Alarm{
    private Logger logger;

    @Override
    public void setLogger(Logger logger){
        this.logger = logger;
    }

    @Override
    public void alarmTurnOn(PinEvent event) {
        System.out.println("Kraty przed sejfem zamkniete!");
        if(logger != null){
            logger.logMessage(Severity.WARNING, EventSource.ALARM, "Zamknieto kraty przed sejfem");
        }
    }

    @Override
    public void alarmTurnOff(PinEvent event) {
        System.out.println("Kraty od sejfu otwarte.");
        if(logger != null){
            logger.logMessage(Severity.INFO, EventSource.ALARM, "Kraty przed sejfem otwarte");
        }
    }
}
