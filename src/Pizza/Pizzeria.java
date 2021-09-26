package Pizza;


import jdk.dynalink.Operation;

import java.util.*;

public class Pizzeria {

    public static void main(String[] args) {



        Cashbox cash = new Cashbox();

        Client client = new Client();

        client.menuZakaz();


        cash.printCheck(client);


    }




}
