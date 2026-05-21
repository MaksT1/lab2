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

}
