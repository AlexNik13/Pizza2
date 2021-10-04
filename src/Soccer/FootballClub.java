package Soccer;

import Soccer.Player.Player;

import java.util.ArrayList;

public class FootballClub {
    private String name;
    private String city;
    private Stadium stadium;
    private ArrayList<Player> player = new ArrayList<>();

    public FootballClub(String name, String city, String stadiumName) {
        this.name = name;
        this.city = city;
        this.stadium = new Stadium(stadiumName, 12000);
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void print() {

        System.out.println("Клуб: " + getName());
        System.out.println("Стадион: " + stadium.getName() + ". На " + stadium.getCapacity() + " человек.");
        System.out.println("Игроки");
        for (Player playar : player) {
            System.out.println(playar);
        }
    }
}
