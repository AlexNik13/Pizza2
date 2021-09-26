package Pizza;


import jdk.dynalink.Operation;

import java.util.ArrayList;

public class Pizzeria {

    public static void main(String[] args) {

       Client client = new Client();
       Pizza[] pizza = new Pizza[3];

       //pizza = client.menuZakaz(pizza);

        pizza[0].createPizza(NamePizza.MEAT);
        pizza[1].createPizza(NamePizza.VEGAN);
        pizza[2].createPizza(NamePizza.FARM);




       Cashbox cash = new Cashbox();

        System.out.println(cash.costPizza(pizza[0]));
        System.out.println(cash.costPizza(pizza[1]));
        System.out.println(cash.costPizza(pizza[2]));

       //System.out.println(cash.costPizza(pz));




    }




}
