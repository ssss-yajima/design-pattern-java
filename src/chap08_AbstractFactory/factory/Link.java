package chap08_AbstractFactory.factory;

public abstract class Link extends Item{
    protected String url;
    public Link(String caption, String url){
        super(caption);
        this.url = url;
    }
    // 親クラスの抽象メソッド(makeHTML)を継承しているので、Linkも抽象クラス
}
