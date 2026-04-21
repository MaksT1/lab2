package lab3;

enum SegmentSamochodu{
    A, B, C, D, SUV, VAN
}

public class Samochod extends Pojazd{
    private SegmentSamochodu segmentSamochodu;
    private String VIN;
    public Samochod(String marka, String nazwa, double pojemnoscSilnika, RodzajSilnika rodzajSilnika, double moc, double momentObrotowy, SegmentSamochodu segmentSamochodu, String VIN) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika, moc, momentObrotowy);
        this.segmentSamochodu = segmentSamochodu;
        this.VIN = VIN;
    }
    public void wyswietl(){
        super.wyswietl();
        System.out.println("Marka: " + marka + " Model: " + nazwa + " VIN: " + VIN + " Segment: " + segmentSamochodu);
        System.out.println("Rodzaj silnika: " + rodzajSilnika + " Pojemnosc silnika: " + pojemnoscSilnika);
    }
}
