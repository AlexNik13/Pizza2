package Soccer;

import Soccer.Player.Attackers;
import Soccer.Player.Enum.PositionType;
import Soccer.Player.Enum.Skill;
import Soccer.Player.Enum.SkillAttackers;
import Soccer.Player.Enum.SkillGoalkeeper;
import Soccer.Player.Goalkeeper;
import Soccer.Player.Player;

import java.util.ArrayList;

public class Football{

    public static void main(String[] args) {

        /*Attackers attackers = new Attackers("Vasil", "Maradonna", 11, 38);

        *//*goalkeeper.setCharacteristic(SkillAttackers.SPEED, 10);

        System.out.println(goalkeeper.getCharacteristic());

        goalkeeper.setCharacteristic(SkillGoalkeeper.MASTERY, 7);

        System.out.println(goalkeeper.getCharacteristic());*//*

        attackers.setCharacteristic(SkillAttackers.SPEED, 10);
        attackers.setCharacteristic(SkillAttackers.STRENGTH, 9);
        attackers.setCharacteristic(SkillAttackers.ACCURACY, 8);

        System.out.println(attackers.getCharacteristic());

        attackers.setPosition(PositionType.RIGHT);
        attackers.setPosition(PositionType.LEFT);

        System.out.println(attackers.getPosition());*/


        /*ArrayList<Player> players = new ArrayList<>();

        players.add(new Attackers("Vasil", "Maradonna", 11, 38));
        players.add(new Attackers("Pile", "Pilevich", 13, 18));

        players.get(0).setCharacteristic(Skill.SPEED, 10);
        players.get(0).setCharacteristic(Skill.STRENGTH, 6);
        players.get(0).setCharacteristic(Skill.ACCURACY, 8);

        players.get(1).setCharacteristic(Skill.SPEED, 8);
        players.get(1).setCharacteristic(Skill.STRENGTH, 7);
        players.get(1).setCharacteristic(Skill.ACCURACY, 5);*/

        FootballClub footballClub = new FootballClub("ФК Черкассы", "Черкасссы", "Центральный");

        footballClub.addPlayer();

        footballClub.print();

    }
}
