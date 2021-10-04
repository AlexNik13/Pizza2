package Soccer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Football {

    public static void main(String[] args) {

        FootballClub footballClub = new FootballClub("ФК Черкассы", "Черкасссы", "Центральный");

        footballClub.addPlayer();

       // footballClub.saveArrayInFile();

        footballClub.print();



    }
}
