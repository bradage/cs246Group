package com.company;

import com.google.gson.Gson;


public class Main {

    static final String SAVE_FILE = "C:/Users/Bradey/Desktop/saveGame.txt";

    public static void main(String[] args) {

        Integer x = 100;
        Integer y = 100;

        while(x == y) {

            System.out.println("looping");

        }

        System.out.println("done");

        Player player1 = new Player("James", 100, 200, 500);

        System.out.println(player1.display());

        Game game1 = new Game(player1);

        game1.saveGame(SAVE_FILE);

        Game game2 = Game.loadGame(SAVE_FILE);
        System.out.println(game2._player.display());

        player1.addEquipment("Sword", 10);
        player1.addEquipment("Sheild", 40);
        player1.addEquipment("Helmet", 30);
        System.out.println(player1.display());
        System.out.println(player1);

        game1.saveGame(SAVE_FILE);
        Game game3 = Game.loadGame(SAVE_FILE);
        System.out.println(game3._player.display());
        System.out.println(game3.getPlayer());

    }
}
