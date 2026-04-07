class Invoice{
    private String product_number;
    private String product_description;
    private int quantity;
    private double pricePerItem;
    Invoice(String product_number, String product_description, int quantity, double pricePerItem){
        setProdN(product_number);
        setProdD(product_description);
        setQuantity(quantity);
        setPerItem(pricePerItem);
    }

    public String getProdN(){
        return product_number;
    }
    public String getProdD(){
        return product_description;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getPricePerItem(){
        return pricePerItem;
    }
    public void setProdN(String product_number){
        this.product_number = product_number;
    }
    public void setProdD(String product_description){
        this.product_description = product_description;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void setPerItem(double pricePerItem){
        this.pricePerItem = pricePerItem;
    }
    public double Amount(int quantity, double pricePerItem){
        return (pricePerItem <=0 || quantity <= 0) ? 0 : pricePerItem * quantity;
    }
}


public class zad6 {
    public static void main(String[] args){
        Invoice in = new Invoice("1235", "thing", 200, 25.99);
        System.out.println(in.getProdN() + " " + in.getProdD() + " " + in.getQuantity() + " " + in.getPricePerItem() + " " + in.Amount(in.getQuantity(), in.getPricePerItem()));
    }
}
