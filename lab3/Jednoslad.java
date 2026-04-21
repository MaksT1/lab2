package lab3;
enum typJednosladu{
    MOTOCYKL, SKUTER, ROWER, HULAJNOGA
}

public class Jednoslad extends Pojazd{
    private typJednosladu typJednosladu;
    public Jednoslad(String marka, String nazwa, double pojemnoscSilnika, RodzajSilnika rodzajSilnika, double moc, double momentObrotowy, typJednosladu typJednosladu) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika, moc, momentObrotowy);
        this.typJednosladu = typJednosladu;
    }
    public Jednoslad (String marka, String nazwa, typJednosladu typJednosladu){
        super(marka, nazwa, 0.0, RodzajSilnika.BRAK,  0.0, 0.0);
        this.typJednosladu = typJednosladu;
    }
    public void wyswietl(){
        super.wyswietl();
        System.out.println("Marka: " + marka + " Model: " + nazwa + " Typ: " + typJednosladu);
        if(rodzajSilnika != RodzajSilnika.BRAK && pojemnoscSilnika > 0){
            System.out.print("Silnik: " + rodzajSilnika + " Pojemosc: " + pojemnoscSilnika);
        }
        else{
            System.out.println("Brak napedu!");
        }
    }
}
