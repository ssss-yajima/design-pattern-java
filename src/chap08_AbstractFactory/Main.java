package chap08_AbstractFactory;

import chap08_AbstractFactory.factory.*;

public class Main {
    public static void main(String[] args) {
        if (args.length !=1){
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.exit(0);
        }
        Factory factory = Factory.getFactory(args[0]);

        Link asahi = factory.createLink("朝日新聞", "http://www.asahi.com/");
        Link yomiuri = factory.createLink("読売新聞", "http://www.yomiuri.co,jp/");
        Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
        Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/");

        Tray traynews = factory.createTray("新聞");
        traynews.add(asahi);
        traynews.add(yomiuri);

        Tray trayyahoo = factory.createTray("Yahoo!");
        trayyahoo.add(us_yahoo);
        trayyahoo.add(jp_yahoo);

        Page page = factory.createPage("LinkPage","Hoge Hogeoge");
        page.add(traynews);
        page.add(trayyahoo);
        page.output();
    }
}
