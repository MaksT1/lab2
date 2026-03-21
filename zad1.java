import java.util.List;

public class zad1{

    public static void main(String[] args){
        Card card = new Card(20, Color.karo);
        System.out.println(card.value + " " + card.color);
        Card card3 = new Card(7, Color.kier);
        System.out.println(card3.value + " " + card3.color);
        Card card2 = new Card(5, Color.pik);
        System.out.println(card2.value + " " + card2.color);
    }
}
enum Color {
    kier, karo, pik, trefl
}

class Card{
    int value;
    Color color;

    public Card(int value, Color color){
        this.value = value;
        this.color = color;
    }
}