public class zad2 {
    public static void main(String[] args){
        Student s1 = new Student("Jan", "Kowalski", "s35262", 75.0, 4);
        System.out.println(s1.imie + " " + s1.nazwisko + " " + s1.id + " " + s1.obecnosc + " " + s1.ocena);

        Student s2 = new Student("s35262", 75.0, 4);
        System.out.println(s2.imie + " " + s2.nazwisko + " " + s2.id + " " + s2.obecnosc + " " + s2.ocena);

        Student s3 = new Student("Jan", "Kowalski", "s35262", 40.0, 4);
        System.out.println(s3.imie + " " + s3.nazwisko + " " + s3.id + " " + s3.obecnosc + " " + s3.ocena);
    }
}

class Student{
    String imie;
    String nazwisko;
    String id;
    double obecnosc;
    int ocena;
    Student(String imie, String nazwisko, String id, double obecnosc, int ocena){
        this.imie = (imie != null && !imie.trim().isEmpty()) ? imie : "Unknown";
        this.nazwisko = (nazwisko != null && !nazwisko.trim().isEmpty()) ? nazwisko : "Unknown";
        this.id = id;
        this.setObecnosc(obecnosc);
        this.setOcena(ocena);
    }
    Student(String id, double obecnosc, int ocena) {
        this("Unknown", "Unknown", id, obecnosc, ocena);
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = (imie != null && !imie.trim().isEmpty()) ? imie : "Unknown";
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = (nazwisko != null && !nazwisko.trim().isEmpty()) ? nazwisko : "Unknown";
    }

    public String getId() {
        return id;
    }

    public void setId(String numerIndeksu) {
        this.id = numerIndeksu;
    }

    public double getObecnosc() {
        return obecnosc;
    }

    public void setObecnosc(double obecnosc) {
        this.obecnosc = obecnosc;
        if (this.obecnosc < 50) {
            this.ocena = 2;
        }
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        if (this.obecnosc < 50) {
            this.ocena = 2;
        } else {
            this.ocena = ocena;
        }
    }

}