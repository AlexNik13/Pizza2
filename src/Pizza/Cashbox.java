package Pizza;

public class Cashbox {
    static private double sumInCash;
    static int checkNumb = 0;
    static double sum;
    void  printCheck(Client client){
        checkNumb++;
        sum = 0;
        System.out.println("Чек № " + checkNumb);
        System.out.println("===================");
        for (int i =0; i < client.zakaz.length; i++){
            System.out.print(client.zakaz[i].getName() + " " + costPizza(client.zakaz[i]) + "\n");
            sum += costPizza(client.zakaz[i]);
        }
        System.out.println("  ИТОГО: " + sum + " грн.");

    }




    double costPizza(Pizza pizza){
        double cost;
        cost =  CostIngredients.doughCostKg.getCost() / 1000 * pizza.getDoughGram() +
                CostIngredients.cheeseCostKg.getCost() / 1000 * pizza.getCheeseGram() +
                CostIngredients.sausageCostKg.getCost() / 1000 * pizza.getSausageGram() +
                CostIngredients.tomatoCostKg.getCost() / 1000 * pizza.getTomatoGram() +
                CostIngredients.meatCostKg.getCost() / 1000 * pizza.getMeatGram() +
                CostIngredients.baconCostKg.getCost() / 1000 * pizza.getBaconGram() +
                CostIngredients.mushroomsCostKg.getCost() / 1000 * pizza.getMushroomsGram() +
                CostIngredients.onionCostKg.getCost() / 1000 * pizza.getOnionGram() +
                CostIngredients.hamCostKg.getCost() / 1000 * pizza.getHamGram() +
                CostIngredients.sauseCostKg.getCost() / 1000 * pizza.getSauseGram() +
                CostIngredients.bellPepperCostKg.getCost() / 1000 * pizza.getBellPepperGram() +
                CostIngredients.broccoliCostKg.getCost() / 1000 * pizza.getBroccoliGram() +
                CostIngredients.olivesCostKg.getCost() / 1000 * pizza.getOlivesGram() ;
        return (int)(cost * 100) / 100;

    }
}
