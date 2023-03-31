package com.example.goldgamefx;

public class Character {
    String name;
    int strength, agility, intelligence, endurance;

    public Character(String name, int strength, int agility, int intelligence, int endurance){
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.endurance = endurance;

        this.name = name;
    }

    //region Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }
    //endregion
}
