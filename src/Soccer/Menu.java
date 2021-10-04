package Soccer;

import Soccer.Player.Enum.PlayerType;
import Soccer.Player.Enum.Skill;
import Soccer.Player.Player;

import java.util.Scanner;

public class Menu {
    Scanner in = new Scanner(System.in);
    ClubManager clubManager;



    FootballClub newFootballClub() {
        System.out.print("Введите название вашего футбольного клуба. ");
        String name = in.next();

        System.out.print("В каком городе находиться ваш клуб. ");
        String city = in.next();

        System.out.print("Название вашего стадиона? ");
        String stadiumName = in.next();

        System.out.print("Вместимость вашего стадиона: ");
        int capacity = in.nextInt();

        return new FootballClub(name, city, stadiumName, capacity);
    }

    void mainMenu(ClubManager clubManager) {
        boolean menu = true;

        while (menu) {
            System.out.println("Главное меню");
            System.out.println("1. Создать игрока");
            System.out.println("2. Добавить игрока");
            System.out.println("3. Добавить играков");
            System.out.println("4. Провести тренеровку");
            System.out.println("5. Печать");
            System.out.println("0. Выход");
            System.out.println("\nСделайте свой выбор");

            int choice = in.nextInt();

            switch (choice){
                case 0:
                    menu = false;
                    break;

                case 1:
                    menuCreatePlayer(clubManager);
                    break;

                case 5:
                    clubManager.getFootballClub().print();
                    break;

            }
        }
    }

    void menuCreatePlayer(ClubManager clubManager){
        System.out.print("Введите имя игрока: ");
        String firstName = in.next();

        System.out.print("Введите фамилию игрока: ");
        String lastName = in.next();

        System.out.print("Введите возраст игрока: ");
        int age = in.nextInt();

        System.out.print("Введите номер игрока: ");
        int number = in.nextInt();

        boolean numberCheck = false;
        for(Player player : clubManager.getFootballClub().getPlayer()){
            if(player.getPlayerNumber() == number){
                numberCheck = true;
                break;
            }
        }


        while (numberCheck){
            numberCheck = false;
            System.out.println("Игрок под таким номером уже есть");
            System.out.print("Введите другой номер игрока: ");
            number = in.nextInt();

            for(Player player : clubManager.getFootballClub().getPlayer()){
                if(player.getPlayerNumber() == number){
                    numberCheck = true;
                    break;
                }
            }
        }

        System.out.println("Выберети тип игрока.");
        System.out.println("1. Голкипер");
        System.out.println("2. Защитники");
        System.out.println("3. Полузащитники");
        System.out.println("4. Нападающие");
        int choice = in.nextInt();

        switch (choice){
            case 1:
                clubManager.getFootballClub().addPlayer(firstName, lastName, number, age, PlayerType.GOALKEEPER);
                clubManager.getFootballClub().getPlayer().get(clubManager.getFootballClub().getPlayer().size() - 1).setCharacteristic(Skill.MASTERY, 1);
                break;
            case 2:
                clubManager.getFootballClub().addPlayer(firstName, lastName, number, age, PlayerType.DEFENDER);
                clubManager.getFootballClub().getPlayer().get(clubManager.getFootballClub().getPlayer().size() - 1).setCharacteristic(Skill.SPEED, 1);
                clubManager.getFootballClub().getPlayer().get(clubManager.getFootballClub().getPlayer().size() - 1).setCharacteristic(Skill.TACKLE, 1);
                clubManager.getFootballClub().getPlayer().get(clubManager.getFootballClub().getPlayer().size() - 1).setCharacteristic(Skill.INTERCEPTION, 1);
                break;
            case 3:
                clubManager.getFootballClub().addPlayer(firstName, lastName, number, age, PlayerType.MIDFIELDER);
                clubManager.getFootballClub().getPlayer().get(clubManager.getFootballClub().getPlayer().size() - 1).setCharacteristic(Skill.SPEED, 1);
                clubManager.getFootballClub().getPlayer().get(clubManager.getFootballClub().getPlayer().size() - 1).setCharacteristic(Skill.PASS, 1);
                clubManager.getFootballClub().getPlayer().get(clubManager.getFootballClub().getPlayer().size() - 1).setCharacteristic(Skill.INTERCEPTION, 1);

                break;
            case 4:
                clubManager.getFootballClub().addPlayer(firstName, lastName, number, age, PlayerType.ATTACKER);
                clubManager.getFootballClub().getPlayer().get(clubManager.getFootballClub().getPlayer().size() - 1).setCharacteristic(Skill.SPEED, 1);
                clubManager.getFootballClub().getPlayer().get(clubManager.getFootballClub().getPlayer().size() - 1).setCharacteristic(Skill.STRENGTH, 1);
                clubManager.getFootballClub().getPlayer().get(clubManager.getFootballClub().getPlayer().size() - 1).setCharacteristic(Skill.ACCURACY, 1);

                break;
        }
    }


    boolean numberCheck(ClubManager clubManager, int number){
        for(Player player : clubManager.getFootballClub().getPlayer()){
            if(player.getPlayerNumber() == number){
                return true;

            }
        }
        return false;
    }
}
