package lab6;

public class PizzaSpecial extends Pizza{
    private int size;
    private int salamiSlices;
    private boolean spicy;
    PizzaSpecial(double calories, String name, double price){
        super(calories, name, price);
        this.size = 40;
        this.salamiSlices = 16;
    }
    PizzaSpecial(){super(1350, "Special", 45.99);}

    public void setSpicy(boolean spicy){
        this.spicy = spicy;
    }
    public boolean getSpicy(){return spicy;}
    public int getSize(){return size;}
}
