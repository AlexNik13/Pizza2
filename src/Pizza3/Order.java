package Pizza3;

import Pizza3.pizza.Pizza;

public class Order {
    Pizza[] pizza = new Pizza[0];
    private double costPizza;
    double cost;

    public Order() {
        pizza = Menu.start(pizza);
        printCheck(pizza);
    }

    void printCheck(Pizza[] pizza){
        System.out.println("Чек");
        for (int i = 0; i < pizza.length; i++){
            System.out.println(pizza[i].getName() + " - " + pizza[i].getCost());
            cost += pizza[i].getCost();
        }
        System.out.println("ИТОГО " + cost);
    }
}
