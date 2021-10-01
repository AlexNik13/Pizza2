package Soccer.Player;

import Soccer.Player.Enum.PositionType;
import Soccer.Player.Enum.Skill;
import Soccer.Player.Enum.SkillAttackers;
import Soccer.Player.Enum.SkillGoalkeeper;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Goalkeeper extends Player {
    private Map<Skill, Integer> characteristic = new TreeMap<>();
    private String type;

    public Goalkeeper(String firstName, String lastName, int playerNnumber, int age) {
        super(firstName, lastName, playerNnumber, age);
        type = "Вратарь";
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public Map<Skill, Integer> getCharacteristic() {
        return characteristic;
    }

    @Override
    public void setCharacteristic(Skill skill, int skillNum) {
        characteristic.put(skill, skillNum);
    }

    @Override
    public Set<PositionType> getPosition() {
        return null;
    }

    @Override
    public void setPosition(PositionType type) {

    }
}
