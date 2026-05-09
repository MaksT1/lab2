package lab4;


public interface Logger {
    Severity getLogLevel();
    void logMessage(Severity severity, EventSource source, String message);
}
