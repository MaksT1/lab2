package lab6;

public class PizzaDeluxe extends Pizza{
    private boolean doubleCheese;
    private int meatTypes;
    private String crustType;
    PizzaDeluxe(double calories, String name, double price){
        super(calories, name, price);
        this.doubleCheese = true; this.meatTypes = 4; this.crustType = "Thin";
    }
    PizzaDeluxe(){
        super(1458, "Deluxe", 15.09);
    }
    public void setCheese(boolean doubleCheese){this.doubleCheese = doubleCheese;}
    public boolean hasDoubleCheese(){return doubleCheese;}
    public String getCrustType(){return crustType;}
}
