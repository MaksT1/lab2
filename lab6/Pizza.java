package lab6;

public abstract class Pizza implements Comparable<Pizza>{
    private double calories;
    private String name;
    private double price;

    Pizza(double calories, String name, double price){
        this.calories = calories;
        this.name = name;
        this.price = price;
    }

    public double getCalories(){return calories;}
    public String getName(){return name;}
    public double getPrice(){return price;}

    @Override
    public String toString(){
        return name + " - Price: " + price + ", calories: " + calories;
    }

    @Override
    public int compareTo(Pizza other) {
        return Double.compare(this.price, other.price);
    }
}
