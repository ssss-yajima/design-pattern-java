package chap04_FactoryMethod.idcard;

import chap04_FactoryMethod.framework.Product;

public class IDCard extends Product {
    private String owner;
    IDCard(String owner){
        System.out.println(owner + "のカードを作ります。");
        this.owner = owner;
    }
    public void use(){
        System.out.println(owner + "のカードを使います。");
    }
    public String getOwner(){
        return owner;
    }
}
