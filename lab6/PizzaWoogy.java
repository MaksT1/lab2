package lab6;

public class PizzaWoogy extends Pizza{
    private int sliceCount;
    private boolean isVegan;
    private boolean lactoseFree;

    PizzaWoogy(double calories, String name, double price){
      super(calories, name, price);
      this.sliceCount = 8; this.lactoseFree = true;
    }

    PizzaWoogy(){super(1100, "Woogy", 11.99);}

    public void setVegan(boolean vegan){this.isVegan = vegan;}
    public boolean isLactoseFree(){return lactoseFree;}
    public int getSliceCount(){return sliceCount;}
}
