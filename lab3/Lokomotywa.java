package lab3;

class Lokomotywa extends Maszyna{
    private int iloscMiejsc;
    private int iloscOsi;

    public Lokomotywa(String marka, String nazwa, double pojemnoscSilnika, RodzajSilnika rodzajSilnika, int iloscMiejsc, int iloscOsi) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika);
        this.iloscMiejsc = iloscMiejsc;
        this.iloscOsi = iloscOsi;
    }
    public void wyswietl(){
        System.out.println("Marka: " + marka + " Nazwa: " + nazwa);
        System.out.println("Pojemosc silnika: " + pojemnoscSilnika + " Rodzaj silnika: " + rodzajSilnika);
        System.out.println("Ilosc miejsc: " + iloscMiejsc + " Ilosc Osi: " + iloscOsi);
    }
}
