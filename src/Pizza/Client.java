package Pizza;

import java.util.Locale;
import java.util.Scanner;

public class Client {
    private int numClient;
    static int id =0;

    double paid;



    public Client() {
        this.numClient = id++;

    }

    Pizza[] zakaz = new Pizza[0];

    Scanner in = new Scanner(System.in);

    void menuZakaz(){
        boolean menu = true;
        while (menu){
            System.out.println("Выбор пицци");
            System.out.println("1. Мясная пицца");
            System.out.println("2. Фермерская пицца");
            System.out.println("3. Вегетарианская пицца");
            System.out.println("4. Своя пицца");
            System.out.println("5. Оплатить");
            int choice = in.nextInt();

            switch (choice){
                case 1:
                    zakaz = addPizza(zakaz, NamePizza.MEAT );
                    break;
                case 2:
                    zakaz = addPizza(zakaz, NamePizza.FARM );
                    break;
                case 3:
                    zakaz = addPizza(zakaz, NamePizza.VEGAN );
                    break;
                case 4:
                    zakaz = addPizza(zakaz, NamePizza.CUSTOMER);
                    break;
                case 5:
                    menu = false;
                    break;
            }

        }

    }




    Pizza[] addPizza(Pizza[] pizza , NamePizza addPizza ){
        Pizza[] newZakaz = new Pizza[pizza.length + 1];

        for(int i = 0; i < pizza.length; i++){
            newZakaz[i] = pizza[i];
        }

        newZakaz[pizza.length] = new Pizza();
        newZakaz[pizza.length].createPizza(addPizza);


        System.out.println("\n Добавить ингредиенты yes. Enter to continue.");
        String str = new String(in.next());
        str = str.toLowerCase();

        if (str.equals("yes")){
            newZakaz[pizza.length].addName("*");
        }

        while (str.equals("yes")) {

            System.out.println("Добавлякм");
            System.out.println("1. Сыр");
            System.out.println("2. Мяска");
            System.out.println("3. Бекон");
            System.out.println("4. Грибы");
            System.out.println("5. Ветчина");
            System.out.println("6. Болгарского перец");
            System.out.println("7. Брокколи");
            System.out.println("8. Оливки ");
            System.out.println("9. Колбасы");
            System.out.println("0. Хватит.");
            int choice = in.nextInt();
            switch (choice){
                case 0:
                    str = new String("no");
                    break;
                case 1:
                    newZakaz[pizza.length].addCheeseGram(50);
                    break;
                case 2:
                    newZakaz[pizza.length].addMeatGram(50);
                    break;
                case 3:
                    newZakaz[pizza.length].addBaconGram(50);
                    break;
                case 4:
                    newZakaz[pizza.length].addMushroomsGram(50);
                    break;
                case 5:
                    newZakaz[pizza.length].addHamGram(50);
                    break;
                case 6:
                    newZakaz[pizza.length].addBellPepperGram(50);
                    break;
                case 7:
                    newZakaz[pizza.length].addBroccoliGram(50);
                    break;
                case 8:
                    newZakaz[pizza.length].addOlivesGram(50);
                    break;
                case 9:
                    newZakaz[pizza.length].addSausageGram(50);
                    break;
            }

        }


        return newZakaz;
    }
}
