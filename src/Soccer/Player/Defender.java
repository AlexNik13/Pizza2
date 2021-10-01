package Soccer.Player;

import Soccer.Player.Enum.PlayerType;
import Soccer.Player.Enum.PositionType;
import Soccer.Player.Enum.SkillDefender;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Defender extends Player {
    private Map<SkillDefender, Integer> characteristic = new TreeMap<>();
    private Set<PositionType> position = new HashSet<>();

    public Defender(String firstName, String lastName, int playerNnumber, int age) {
        super(firstName, lastName, playerNnumber, age, PlayerType.DEFENDER);
    }

    public Map<SkillDefender, Integer> getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(SkillDefender skill, int skillNum) {
        characteristic.put(skill, skillNum);
    }

    public Set<PositionType> getPosition() {
        return position;
    }

    public void setPosition(PositionType type) {
        this.position.add(type);
    }
}
