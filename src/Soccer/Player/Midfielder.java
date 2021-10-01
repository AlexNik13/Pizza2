package Soccer.Player;

import Soccer.Player.Enum.PlayerType;
import Soccer.Player.Enum.PositionType;
import Soccer.Player.Enum.SkillMidfielder;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Midfielder extends Player {
    private Map<SkillMidfielder, Integer> characteristic = new TreeMap<>();
    private Set<PositionType> position = new HashSet<>();

    public Midfielder(String firstName, String lastName, int playerNnumber, int age) {
        super(firstName, lastName, playerNnumber, age, PlayerType.MIDFIELDER);
    }

    public Map<SkillMidfielder, Integer> getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(SkillMidfielder skill, int skillNum) {
        characteristic.put(skill, skillNum);
    }

    public Set<PositionType> getPosition() {
        return position;
    }

    public void setPosition(PositionType type) {
        this.position.add(type);
    }
}
