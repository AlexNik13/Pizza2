package Soccer.Player;

import Soccer.Player.Enum.PositionType;
import Soccer.Player.Enum.Skill;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Midfielders extends Player {
    private Map<Skill, Integer> characteristic = new TreeMap<>();
    private Set<PositionType> position = new HashSet<>();
    private String type;

    public Midfielders(String firstName, String lastName, int playerNnumber, int age) {
        super(firstName, lastName, playerNnumber, age);
        type = "Полузащитники";
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

    public Set<PositionType> getPosition() {
        return position;
    }

    public void setPosition(PositionType type) {
        this.position.add(type);
    }
}
