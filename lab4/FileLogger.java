package lab4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileLogger implements Logger{
    private Severity logLevel;
    private String fileP;

    public FileLogger(Severity logLevel, String fileP){
        this.logLevel = logLevel;
        this.fileP = fileP;
    }

    @Override
    public Severity getLogLevel() {
        return logLevel;
    }

    @Override
    public void logMessage(Severity severity, EventSource source, String message) {
        if(severity.compareTo(logLevel) >= 0){
            try(PrintWriter out = new PrintWriter(new FileWriter(fileP, true))){
                out.println("[LOG] " + severity + " Source: " + source + " - " + message);
            }catch (IOException e){
                System.err.println("Blad zapisu do pliku" + e.getMessage());
            }
        }

    }
}
