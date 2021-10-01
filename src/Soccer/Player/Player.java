package Soccer.Player;

import Soccer.Player.Enum.PlayerType;

import java.util.Map;

public abstract class Player {
    private String firstName;
    private String lastName;
    private int playerNnumber;
    private int age;
    private PlayerType type;

    public Player(String firstName, String lastName, int playerNnumber, int age, PlayerType type) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.playerNnumber = playerNnumber;
        this.age = age;
        this.type = type;
    }

    public PlayerType getType() {
        return type;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
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
}
