package chap04_FactoryMethod.idcard;

import chap04_FactoryMethod.framework.Factory;
import chap04_FactoryMethod.framework.Product;

import java.util.Vector;

public class IDCardFactory extends Factory {
    private Vector owners = new Vector();
    protected Product createProduct(String owner){
        return new IDCard(owner);
    }
    protected void registerProduct(Product product){
        owners.add(product);
    }
    public Vector getOwners(){
        return owners;
    }

}
