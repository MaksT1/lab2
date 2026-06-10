package lab6;

import java.util.Arrays;

public class PizzaApp {
    public static void main(String[] args){
        Pizza[] pizzas = new Pizza[40];

        for(int i = 0; i < 40; i++){
            if(i%3==0) pizzas[i] = new PizzaDeluxe(1560, "Deluxe no. "+(i+1), Math.round(15.0 + Math.random()*10));
            else if(i%3==1) pizzas[i] = new PizzaSpecial(1650, "Special no. "+(i+1), Math.round(13.0 + Math.random()*10));
            else pizzas[i] = new PizzaWoogy(1220, "Woogy no. "+(i+1), Math.round(11.0 + Math.random()*12));
        }

        Arrays.sort(pizzas);

        for(Pizza p : pizzas){
            System.out.println(p.toString());
        }
    }
}
