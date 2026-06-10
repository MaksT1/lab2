package lab6;

public class UsedCarException extends Exception{
    UsedCarException(String vin){
        super("Error for vin: " + vin);
    }
}
