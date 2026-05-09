package lab4;

public class ConsoleLogger implements Logger{
    private Severity logLevel;

    public ConsoleLogger(Severity logLevel){
        this.logLevel = logLevel;
    }

    @Override
    public Severity getLogLevel() {
        return logLevel;
    }

    @Override
    public void logMessage(Severity severity, EventSource source, String message) {
        if(severity.compareTo(logLevel) >= 0){
            System.out.println("[LOG]" + severity + " Source: " + source + " - " + message);
        }
    }
}
