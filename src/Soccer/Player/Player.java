package Soccer.Player;

import Soccer.Player.Enum.PositionType;
import Soccer.Player.Enum.Skill;
import Soccer.Player.Enum.SkillAttackers;

import java.util.Map;
import java.util.Set;

public abstract class Player {
    private String firstName;
    private String LastName;
    private int playerNnumber;
    private int age;

    public Player(String firstName, String lastName, int playerNnumber, int age) {
        this.firstName = firstName;
        LastName = lastName;
        this.playerNnumber = playerNnumber;
        this.age = age;
    }

    public String getName() {
        return firstName + " " + LastName;
    }



    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getPlayerNnumber() {
        return playerNnumber;
    }

    public void setPlayerNnumber(int playerNnumber) {
        this.playerNnumber = playerNnumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract Map<Skill, Integer> getCharacteristic();


    public abstract void setCharacteristic(Skill skill, int skillNum);

    public abstract Set<PositionType> getPosition();

    public abstract void setPosition(PositionType type);

    public abstract String getType();
}
