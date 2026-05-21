package lab5;

public class ChemicalElement {
    private String name;
    private String symbol;
    private int atomicNumber;

    ChemicalElement(String name, String symbol, int atomicNumber){
        this.name = name;
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
    }
    public String getName(){
        return name;
    }
    public String getSymbol(){
        return symbol;
    }
    public int getAtomicNumber(){
        return atomicNumber;
    }
    public boolean isAlkali(){
        int[] alkali = {3, 11, 19, 37, 55, 87};
        for(int num : alkali){
            if(this.atomicNumber == num){
                return true;
            }
        }
        return false;
    }
    public boolean isTransition(){
        return (this.atomicNumber >=21 && this.atomicNumber <=31) ||
                (atomicNumber >= 39 && atomicNumber <= 48) ||
                (atomicNumber >= 72 && atomicNumber <= 80) ||
                (atomicNumber >= 104 && atomicNumber <= 112);
    }
    public boolean isMetal(){
        int[] metal = {13, 49, 50, 81, 82, 83, 113, 114, 115, 116};
        for(int num : metal){
            if(this.atomicNumber == num){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        String type;
        if(isAlkali()){
            type = "Alkali metal";
        }
        else if(isTransition()){
            type = "Transition metal";
        }
        else if(isMetal()){
            type = "Metal";
        }else{
            type = "Not a metal";
        }
        return "Name: " + name + ", Symbol: " + symbol + ", Atomic number: " + atomicNumber + ", Type: " + type;
    }

    public static void main(String[] args){
        ChemicalElement chem = new ChemicalElement("Hydrogen", "H", 1);
        System.out.println(chem.toString());
    }

}
