package Pizza3.pizza;

import Pizza3.ingredients.Ingredient;

import java.util.Scanner;

public abstract class Pizza {

    private String name;
    private double costPizza;
    private Ingredient[] ingredients = new Ingredient[3];

    Scanner in = new Scanner(System.in);

    Pizza(String name){
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void baseIningredient(){
        ingredients[0] = new Ingredient("Тесто", 50, 100);
        ingredients[1] = new Ingredient("Сыр", 50, 100);
        ingredients[2] = new Ingredient("Соус", 50, 50);
    }


    public double getCost() {
        return costPizza;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }

    public Ingredient[] addIngredient(){
        System.out.println("Введите имя ингредиента");
        String name = in.next();
        System.out.println("Введите цену ингредиента");
        double cost = in.nextDouble();
        System.out.println("Введите количество в граммах");
        int quantity = in.nextInt();
        Ingredient[] temp = new Ingredient[ingredients.length +1];
        for(int i = 0; i < ingredients.length; i++){
            temp[i] = ingredients[i];
        }
        temp[ingredients.length] = new Ingredient(name, cost, quantity);
        costPizza();
        return temp;
    }

    public double costPizza(){
        costPizza = 0;
        for(int i = 0; i < ingredients.length; i++){
            costPizza += (ingredients[i].getCost() / 1000) * ingredients[i].getQuantity();
        }
        return (double) Math.round(costPizza * 100) / 100;
    }

    public void dopIngredients(){
        int choice;
        do {
            System.out.println("Добавки к пицце 1 - да, 2 - нет. ");
            choice = in.nextInt();

            if(choice == 1){
                ingredients = addIngredient();
            }
        }while (choice == 1);
    }

}
