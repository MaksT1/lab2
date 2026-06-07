package lab6;

public class DemoRunners {
    public static void main(String[] args){
        Runner r1 = new Machine();
        Runner r2 = new Athlete();
        Runner r3 = new PoliticalCandidate();
        r1.run();
        r2.run();
        r3.run();
    }
}
