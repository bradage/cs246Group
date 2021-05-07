package com.company;

import com.google.gson.Gson;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Game {

    Player _player;

    public Game(Player player){
        this._player = player;
    }

    public Player getPlayer(){
        return _player;
    }


    public void saveGame(String filename){
        Gson gson = new Gson();

        String playerJson = gson.toJson(_player);

        try(Writer w = new BufferedWriter(new OutputStreamWriter( new FileOutputStream(filename), "UTF-8"))) {
            w.write(playerJson);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static Game loadGame(String filename){

        String gameData = null;

        try{
            byte[] encoded = Files.readAllBytes(Paths.get(filename));
            gameData = new String(encoded, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Gson gson = new Gson();

        Player savedPlayer = gson.fromJson(gameData, Player.class);

        Game newGame = new Game(savedPlayer);

       return newGame;
    }




}
