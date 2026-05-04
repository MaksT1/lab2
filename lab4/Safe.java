package lab4;


import java.util.ArrayList;
import java.util.List;

public class Safe {
    public List<Alarm> alarms;
    private String pin;
    public Safe(String pin){
        this.pin = pin;
        this.alarms = new ArrayList<>();
    }
    public void addAlarm(Alarm alarm){
        alarms.add(alarm);
    }
    public void removeAlarm(Alarm alarm){
        alarms.remove(alarm);
    }
    public void enterPin(String entPin){
        System.out.println("Wpisany pin: " + entPin);
        if(this.pin.equals(entPin)){
            correctPin();
        }
        else{
            wrongPin();
        }
    }
    private void wrongPin(){
        System.out.println("Pin niepoprawny!");
        PinEvent event = new PinEvent(this);
        for(Alarm alarm : alarms){
            alarm.alarmTurnOn(event);
        }
    }

    private void correctPin(){
        System.out.println("Pin poprawny!");
        PinEvent event = new PinEvent(this);
        for(Alarm alarm : alarms){
            alarm.alarmTurnOff(event);
        }
    }

}
