package Soccer;

import Soccer.Player.*;
import Soccer.Player.Enum.*;

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

    public void addPlayer() {
        //Меню по добавлению игроков.
        player.add(new Attacker("Vasil", "Maradonna", 11, 38));

        ((Attacker) player.get(0)).setPosition(PositionType.CENTER);
        ((Attacker) player.get(0)).setPosition(PositionType.LEFT);
        ((Attacker) player.get(0)).setCharacteristic(SkillAttacker.SPEED, 10);
        ((Attacker) player.get(0)).setCharacteristic(SkillAttacker.STRENGTH, 6);
        ((Attacker) player.get(0)).setCharacteristic(SkillAttacker.ACCURACY, 8);

        player.add(new Attacker("Pile", "Pilevich", 13, 18));
        ((Attacker) player.get(1)).setPosition(PositionType.RIGHT);
        ((Attacker) player.get(1)).setCharacteristic(SkillAttacker.SPEED, 8);
        ((Attacker) player.get(1)).setCharacteristic(SkillAttacker.STRENGTH, 7);
        ((Attacker) player.get(1)).setCharacteristic(SkillAttacker.ACCURACY, 5);

        player.add(new Midfielder("Паша", "Красовский", 11, 42));
        ((Midfielder) player.get(2)).setPosition(PositionType.LEFT);
        ((Midfielder) player.get(2)).setPosition(PositionType.CENTER);
        ((Midfielder) player.get(2)).setCharacteristic(SkillMidfielder.SPEED, 7);
        ((Midfielder) player.get(2)).setCharacteristic(SkillMidfielder.PASS, 8);
        ((Midfielder) player.get(2)).setCharacteristic(SkillMidfielder.INTERCEPTION, 9);

        player.add(new Defender("Павел", "Воля", 31, 19));
        ((Defender) player.get(3)).setPosition(PositionType.LEFT);
        ((Defender) player.get(3)).setCharacteristic(SkillDefender.SPEED, 10);
        ((Defender) player.get(3)).setCharacteristic(SkillDefender.TACKLE, 8);
        ((Defender) player.get(3)).setCharacteristic(SkillDefender.INTERCEPTION, 7);

        player.add(new Goalkeeper("Максим", "Ужасный", 54, 45));
        ((Goalkeeper) player.get(4)).setPosition(PositionType.LEFT);
        ((Goalkeeper) player.get(4)).setCharacteristic(SkillGoalkeeper.MASTERY, 10);

    }

    public String getCity() {
        return city;
    }

    public void print() {


        System.out.println("Клуб: " + getName());
        System.out.println("Стадион: " + stadium.getName() + ". На " + stadium.getCapacity() + " человек.");
        System.out.println("Игроки");
        for (int i = 0; i < player.size(); i++) {

            System.out.print((i + 1) + " " + player.get(i).getName() + " № " + player.get(i).getPlayerNnumber()
                    + " " + player.get(i).getType());

            if (player.get(i).getType().equals(PlayerType.ATTACKER)) {
                System.out.print(" " + ((Attacker) player.get(i)).getPosition() + "\n");
            }
            if (player.get(i).getType().equals(PlayerType.GOALKEEPER)) {
                System.out.print(" " + ((Goalkeeper) player.get(i)).getPosition() + "\n");
            }
            if (player.get(i).getType().equals(PlayerType.DEFENDER)) {
                System.out.print(" " + ((Defender) player.get(i)).getPosition() + "\n");
            }
            if (player.get(i).getType().equals(PlayerType.MIDFIELDER)) {
                System.out.print(" " + ((Midfielder) player.get(i)).getPosition() + "\n");
            }
        }
    }
}
