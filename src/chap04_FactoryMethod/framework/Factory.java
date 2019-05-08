package chap04_FactoryMethod.framework;

public abstract class Factory {
    // メソッドにfinalを付けると、サブクラスでオーバーライドできなくなる。最終版。
    public final Product create(String owner){
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
