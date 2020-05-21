package com.gameModels.creatures;

import com.gameModels.actions.Attack;
import com.gameModels.actions.Move;
import com.gameModels.actions.Sacrifice;

public abstract class BasicCreature{
    protected String name;
    protected int attackPoints;
    protected int defencePoints;
    protected int magicPoints;
    protected int speed;
    protected int currentDefencePoints;

    public int getCurrentDefencePoints() {
        return currentDefencePoints;
    }

    public void setCurrentDefencePoints(int currentDefencePoints) {
        this.currentDefencePoints = currentDefencePoints;
    }

    int posX;
    int posY;

    BasicCreature(String name, int attackPoints, int defencePoints, int magicPoints, int speed){
        this.name = name;
        this.attackPoints = attackPoints;
        this.defencePoints = defencePoints;
        this.magicPoints = magicPoints;
        this.speed = speed;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public int getDefencePoints() {
        return defencePoints;
    }

    public int getMagicPoints() {
        return magicPoints;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public void setDefencePoints(int defencePoints) {
        this.defencePoints = defencePoints;
    }
    public void changePosition(int x, int y){ posX = x; posY = y;}


}
