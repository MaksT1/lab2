package lab3;

import java.util.ArrayList;
import java.util.List;

public class ParkMaszynowy {
    public static void main(String[] args){
        Lokomotywa lok1 = new Lokomotywa("bcd", "abc", 110000.0, RodzajSilnika.Benzyna, 450, 6);
        Lokomotywa lok2 = new Lokomotywa("dbd", "dbd", 0.0, RodzajSilnika.EV, 230, 4);

        Kosiarka kos1 = new Kosiarka("Kosiareczki", "Kosiarek", 0.0, RodzajSilnika.EV, true, true, 3);
        Kosiarka kos2 = new Kosiarka("Honda", "HondaMow", 160.0, RodzajSilnika.Diesel, false, true, 2);

        Samochod sam1 = new Samochod("Suzuki", "Swift", 1300.0, RodzajSilnika.LPG, 93.0, 82.0, SegmentSamochodu.B, "FN29588302934N245");
        Samochod sam2 = new Samochod("Dodge", "Challenger", 6200.0, RodzajSilnika.Benzyna, 450.0, 420.0, SegmentSamochodu.D, "1FA6P8CF4M5123456");

        Jednoslad jed1 = new Jednoslad("Yamaha", "MT-07", 689.0, RodzajSilnika.Benzyna, 73.4, 67.0, typJednosladu.MOTOCYKL);
        Jednoslad jed2 = new Jednoslad("Trek", "Marlin 7", typJednosladu.ROWER);

        List<Maszyna> maszyny = new ArrayList<>();
        maszyny.add(lok1);
        maszyny.add(lok2);
        maszyny.add(kos1);
        maszyny.add(kos2);
        maszyny.add(sam1);
        maszyny.add(sam2);
        maszyny.add(jed1);
        maszyny.add(jed2);

        for(Maszyna m : maszyny){
            m.wyswietl();
            System.out.println();
        }

        System.out.print("Kosiarka przed zmiana: ");
        kos2.wyswietl();

        kos2.setCzyMelekser(true);
        System.out.println();
        System.out.print("Kosiarka po zmianie: ");
        kos2.wyswietl();
    }
}
