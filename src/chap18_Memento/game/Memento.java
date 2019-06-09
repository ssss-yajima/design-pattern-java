package chap18_Memento.game;

import java.util.Vector;

public class Memento {
    int money;
    Vector fruits;
    public int getMoney(){
        return money;
    }

    Memento(int money) {
        this.money = money;
        this.fruits = new Vector();
    }

    void addFruits(String fruit) {
        fruits.add(fruit);
    }
    Vector getFruits() {
        return fruits;
    }
}
