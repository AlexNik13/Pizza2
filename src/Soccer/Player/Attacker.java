package Soccer.Player;

import Soccer.Player.Enum.PlayerType;
import Soccer.Player.Enum.PositionType;
import Soccer.Player.Enum.SkillAttacker;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Attacker extends Player {
    private Map<SkillAttacker, Integer> characteristic = new TreeMap<>();
    private Set<PositionType> position = new HashSet<>();

    public Attacker(String firstName, String lastName, int playerNnumber, int age) {
        super(firstName, lastName, playerNnumber, age, PlayerType.ATTACKER);
    }

    public Map<SkillAttacker, Integer> getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(SkillAttacker skill, int skillNum) {
        characteristic.put(skill, skillNum);
    }

    public Set<PositionType> getPosition() {
        return position;
    }

    public void setPosition(PositionType type) {
        this.position.add(type);
    }
}
