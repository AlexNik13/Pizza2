package Soccer;

public class Football {

    public static void main(String[] args) {

        FootballClub footballClub = new FootballClub("ФК Черкассы", "Черкасссы", "Центральный");

        footballClub.addPlayer();

        footballClub.print();
    }
}
