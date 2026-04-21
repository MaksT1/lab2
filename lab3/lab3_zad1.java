package lab3;

enum RodzajSilnika {
    Benzyna, Diesel, LPG, EV
}

abstract class Maszyna{
    protected String marka;
    protected String nazwa;
    protected double pojemnoscSilnika;
    protected RodzajSilnika rodzajSilnika;
    public Maszyna(String marka, String nazwa, double pojemnoscSilnika, RodzajSilnika rodzajSilnika){
        this.marka = marka;
        this.nazwa = nazwa;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.rodzajSilnika = rodzajSilnika;
    }

}

public class lab3_zad1 {
}
