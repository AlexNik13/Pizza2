package Soccer;

public class ClubManager {
    private String name;
    private FootballClub footballClub;


    public ClubManager(String name) {
        this.name = name;
        Menu menu = new Menu() ;
        footballClub = menu.newFootballClub();
        menu.mainMenu(this);
    }

    public FootballClub getFootballClub() {
        return footballClub;
    }

    public void setFootballClub(FootballClub footballClub) {
        this.footballClub = footballClub;
    }

    public String getName() {
        return name;
    }

    void addPlayer(){

    }



}
