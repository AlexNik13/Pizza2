package Pizza3;

import Pizza3.pizza.Pizza;
import Pizza3.pizza.PizzaMeat;

public class Programm {

    public static void main(String[] args) {
        Pizza pz = new PizzaMeat();
        System.out.println(pz.getName());
        System.out.println(pz.getCost());
        System.out.println(pz.costPizza());



    }
}
