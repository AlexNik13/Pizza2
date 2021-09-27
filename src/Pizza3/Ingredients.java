package Pizza3;

public class Ingredients {
    private String name;
    private double cost;
    private int quantity;


    public Ingredients(String name, double cost){
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }
}
