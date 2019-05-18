package chap08_AbstractFactory.listfactory;

import chap08_AbstractFactory.factory.*;

public class ListLink extends Link {
    public ListLink(String caption, String url){
        super(caption, url);
    }
    public String makeHTML() {
        return "  <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
