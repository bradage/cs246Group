package com.company;

import java.util.HashMap;
import java.util.Map;

public class Player {

    private String _name;
    private int _health;
    private int _mana;
    private int _gold;
    private Map<String, Integer> equipment;

    public Player(String name, int health, int mana, int gold) {
        this._name = name;
        this._health = health;
        this._mana = mana;
        this._gold = gold;
        this.equipment = new HashMap<>();
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public int get_health() {
        return _health;
    }

    public void set_health(int _health) {
        this._health = _health;
    }

    public int get_mana() {
        return _mana;
    }

    public void set_mana(int _mana) {
        this._mana = _mana;
    }

    public int get_gold() {
        return _gold;
    }

    public void set_gold(int _gold) {
        this._gold = _gold;
    }

    public String display() {
        return "player name is " + this._name;
    }

    public void addEquipment(String itemName, int itemValue){
        equipment.put(itemName, itemValue);
    }

    @Override
    public String toString() {
        return String.format("Player %s has %d health, %d mana, and %d gold.\nThey are holding %d items.\n",
                _name, _health, _mana, _gold, equipment.size());
    }



}
