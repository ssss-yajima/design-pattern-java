package chap18_Memento;

import chap18_Memento.game.Gamer;
import chap18_Memento.game.Memento;

public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 100; i++) {
            System.out.println("===" + i);
            System.out.println("現状"+gamer);
            gamer.bet();
            System.out.println("所持金は" + gamer.getMoney() + "円になりました");

            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("   （だいぶ増えたので保存)");
                memento = gamer.createMemento();

            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("だいぶ減ったので復帰");
                gamer.restoreMemento(memento);
            }
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }
    }
}
