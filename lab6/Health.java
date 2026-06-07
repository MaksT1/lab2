package lab6;

public class Health extends Insurance{
    public Health(){
        super("Health");
        setCost();
    }
    @Override
    public void setCost(){
        this.monthlyPrice = 196.0;
    }
    @Override
    public void display(){
        System.out.println("Insurance type: " + insuranceType + ", Cost: " + monthlyPrice);
    }
}
