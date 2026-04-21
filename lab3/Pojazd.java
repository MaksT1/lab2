package lab3;

public abstract class Pojazd extends Maszyna{
    protected double moc;
    protected double momentObrotowy;
    protected int nrPojazdu;
    protected static int maxLiczbaPojazdow = 0;
    public Pojazd(String marka, String nazwa, double pojemnoscSilnika, RodzajSilnika rodzajSilnika){
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika);
        this.moc = moc;
        this.momentObrotowy = momentObrotowy;
        maxLiczbaPojazdow++;
        this.nrPojazdu = maxLiczbaPojazdow;
    }
    public void wyswietl(){
        System.out.println("Pojazd nr. " + nrPojazdu + " z " + maxLiczbaPojazdow);
        System.out.println("Marka: " + marka + " Nazwa: " + nazwa);
        System.out.println("Pojemosc silnika: " + pojemnoscSilnika + " Rodzaj silnika: " + rodzajSilnika);
        System.out.println("Moc: " + moc + "KM Moment obrotowy: " + momentObrotowy + "nM");

    }
}
