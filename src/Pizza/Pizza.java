package Pizza ;

import java.util.EnumMap;
import java.util.Map;

public class Pizza extends ArrayPizza implements PizzaFactori {

    private String name;
    private int doughGram;
    private int sauseGram;
    private int tomatoGram;

    private int cheeseGram;
    private int meatGram;
    private int baconGram;
    private int mushroomsGram;
    private int onionGram;
    private int hamGram;
    private int sausageGram;
    private int bellPepperGram;
    private int broccoliGram;
    private int olivesGram;

    Pizza(){

    }

    @Override
    public void createPizza(NamePizza pizza) {
        this.name = pizza.namePizza();
        this.doughGram 	= pizza.getDoughGram();
        this.sauseGram = pizza.getSauseGram();
        this.tomatoGram = pizza.getTomatoGram();
        this.cheeseGram = pizza.getCheeseGram();
        this.meatGram = pizza.getMeatGram();
        this.baconGram = pizza.getBaconGram();
        this.mushroomsGram = pizza.getMushroomsGram();
        this.onionGram = pizza.getOnionGram();
        this.hamGram = pizza.getHamGram();
        this.sausageGram = pizza.getSausageGram();
        this.bellPepperGram = pizza.getBellPepperGram();
        this.broccoliGram = pizza.getBroccoliGram();
        this.olivesGram = pizza.getOlivesGram();

    }

    //addIngredients

    public void addName(String name) {
        this.name += name;
    }

    public void addDoughGram(int doughGram) {
        this.doughGram += doughGram;
    }

    public void addSauseGram(int sauseGram) {
        this.sauseGram += sauseGram;
    }

    public void addTomatoGram(int tomatoGram) {
        this.tomatoGram += tomatoGram;
    }

    public void addCheeseGram(int cheeseGram) {
        this.cheeseGram += cheeseGram;
    }

    public void addMeatGram(int meatGram) {
        this.meatGram += meatGram;
    }

    public void addBaconGram(int baconGram) {
        this.baconGram += baconGram;
    }

    public void addMushroomsGram(int mushroomsGram) {
        this.mushroomsGram += mushroomsGram;
    }

    public void addOnionGram(int onionGram) {
        this.onionGram += onionGram;
    }

    public void addHamGram(int hamGram) {
        this.hamGram += hamGram;
    }

    public void addSausageGram(int sausageGram) {
        this.sausageGram += sausageGram;
    }

    public void addBellPepperGram(int bellPepperGram) {
        this.bellPepperGram += bellPepperGram;
    }

    public void addBroccoliGram(int broccoliGram) {
        this.broccoliGram += broccoliGram;
    }

    public void addOlivesGram(int olivesGram) {
        this.olivesGram += olivesGram;
    }

    //

    public String getName() {
        return name;
    }

    public int getDoughGram() {
        return doughGram;
    }

    public int getSauseGram() {
        return sauseGram;
    }

    public int getTomatoGram() {
        return tomatoGram;
    }

    public int getCheeseGram() {
        return cheeseGram;
    }

    public int getMeatGram() {
        return meatGram;
    }

    public int getBaconGram() {
        return baconGram;
    }

    public int getMushroomsGram() {
        return mushroomsGram;
    }

    public int getOnionGram() {
        return onionGram;
    }

    public int getHamGram() {
        return hamGram;
    }

    public int getSausageGram() {
        return sausageGram;
    }

    public int getBellPepperGram() {
        return bellPepperGram;
    }

    public int getBroccoliGram() {
        return broccoliGram;
    }

    public int getOlivesGram() {
        return olivesGram;
    }
}
