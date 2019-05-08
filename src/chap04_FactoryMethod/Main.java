package chap04_FactoryMethod;

import chap04_FactoryMethod.framework.*;
import chap04_FactoryMethod.idcard.*;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create(("ほげ太郎"));
        Product card2 = factory.create(("ほげほげ男"));
        Product card3 = factory.create(("ふが美"));
        card1.use();
        card2.use();
        card3.use();
    }
}
