package lab6;

public class DemoTurners2 {
    public static void main(String[] args){
        Turner leaf = new Leaf();
        Turner page = new Page();
        Turner pancake = new Pancake();
        Turner car = new Car();
        Turner face = new Face();

        leaf.turn();
        page.turn();
        pancake.turn();
        car.turn();
        face.turn();
    }
}
