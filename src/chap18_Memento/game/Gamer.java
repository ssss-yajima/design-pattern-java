package chap18_Memento.game;

import java.util.Random;
import java.util.Vector;

public class Gamer {
    private int money;
    private Vector<String> fruits = new Vector<String>();
    private Random random = new Random();
    private static String[] fruitsname = {"apple","oragne","grape"};

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }
    public void bet() {
        int dice = random.nextInt(6)+1;
        if (dice == 1) {
            money += 100;
            System.out.println("所持金が増えました");
        } else if (dice == 2) {
            money /=2;
            System.out.println("所持金が半分になりました");
        } else if (dice == 6) {
            String f = getFruit();
            System.out.println("フルーツ(" + f + ")をもらいました");
            fruits.add(f);
        } else {
            System.out.println("何も起こりませんでした");
        }
    }
    public Memento createMemento() {
        Memento m = new Memento(money);
        for (String fruit : fruits) {
            if (fruit.startsWith("おいしい")) {
                m.addFruits(fruit);
            }
        }
        return m;
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }
    public String toString() {
        return "[money="+money + ", fruits="+fruits+"]";
    }

    private String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "おいしい";
        }
        return prefix + fruitsname[random.nextInt((fruitsname.length))];
    }


}
