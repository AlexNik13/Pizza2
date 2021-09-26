package Pizza;

import java.util.Scanner;

public class Client {
    private int numClient;
    static int id =0;
    //public Pizza[] zakaz;
    double paid;
    //public ArrayPizza[] zakaz ;
    public Client() {
        this.numClient = id++;
    //    zakaz = new Pizza[0];
    }



    Scanner in = new Scanner(System.in);

    Pizza[] menuZakaz(Pizza[] zakaz){
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
        return zakaz;
    }




    Pizza[] addPizza(Pizza[] pizza , NamePizza addPizza ){
        System.out.println("addPizza " + pizza.length);
        Pizza[] newZakaz = new Pizza[pizza.length + 1];
        System.out.println("newZakaz " + newZakaz.length);

        for(int i = 0; i < pizza.length; i++){
            newZakaz[i] = pizza[i];
        }
        newZakaz[pizza.length].createPizza(addPizza);


        return newZakaz;
    }
}
