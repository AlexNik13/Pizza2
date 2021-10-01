package Soccer;

import Soccer.Player.Attackers;
import Soccer.Player.Enum.PositionType;
import Soccer.Player.Enum.Skill;
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

    public void addPlayer(){
        player.add(new Attackers("Vasil", "Maradonna", 11, 38));
        player.get(0).setPosition(PositionType.CENTER);
        player.get(0).setPosition(PositionType.LEFT);
        player.get(0).setCharacteristic(Skill.SPEED, 10);
        player.get(0).setCharacteristic(Skill.STRENGTH, 6);
        player.get(0).setCharacteristic(Skill.ACCURACY, 8);
        player.add(new Attackers("Pile", "Pilevich", 13, 18));
        player.get(1).setPosition(PositionType.RIGHT);
        player.get(1).setCharacteristic(Skill.SPEED, 8);
        player.get(1).setCharacteristic(Skill.STRENGTH, 7);
        player.get(1).setCharacteristic(Skill.ACCURACY, 5);


    }

    public String getCity() {
        return city;
    }

    public void print (){
        System.out.println("Клуб: " + getName());
        System.out.println("Стадион: " + stadium.getName() + ". На " + stadium.getCapacity() + " человек.");
        System.out.println("Игроки");
        for (int i =0; i < player.size(); i++){
            System.out.println((i+1) + " " + player.get(i).getName() + " № " +  player.get(i).getPlayerNnumber()
                    +" " + player.get(i).getType() + " " + player.get(i).getPosition());

        }

    }
}
