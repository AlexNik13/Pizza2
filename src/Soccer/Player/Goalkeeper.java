package Soccer.Player;

import Soccer.Player.Enum.PlayerType;
import Soccer.Player.Enum.PositionType;
import Soccer.Player.Enum.SkillGoalkeeper;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Goalkeeper extends Player {
    private Map<SkillGoalkeeper, Integer> characteristic = new TreeMap<>();
    private Set<PositionType> position = new HashSet<>();

    public Goalkeeper(String firstName, String lastName, int playerNnumber, int age) {
        super(firstName, lastName, playerNnumber, age, PlayerType.GOALKEEPER);
        position.add(PositionType.GATE);
    }

    public Map<SkillGoalkeeper, Integer> getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(SkillGoalkeeper skill, int skillNum) {
        characteristic.put(skill, skillNum);
    }

    public Set<PositionType> getPosition() {
        return position;
    }

    public void setPosition(PositionType type) {

    }
}
