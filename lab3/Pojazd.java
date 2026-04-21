package lab3;

public abstract class Pojazd extends Maszyna{
    protected double moc;
    protected double momentObrotowy;
    protected int nrPojazdu;
    protected static int maxLiczbaPojazdow = 0;
    public Pojazd(String marka, String nazwa, double pojemnoscSilnika, RodzajSilnika rodzajSilnika, double moc, double momentObrotowy){
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika);
        this.moc = moc;
        this.momentObrotowy = momentObrotowy;
        maxLiczbaPojazdow++;
        this.nrPojazdu = maxLiczbaPojazdow;
    }
    public void wyswietl(){
        System.out.println("Pojazd nr. " + nrPojazdu + " z " + maxLiczbaPojazdow);
        System.out.println("Moc: " + moc + "KM Moment obrotowy: " + momentObrotowy + "nM");

    }
}
