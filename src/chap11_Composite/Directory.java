package chap11_Composite;

import java.util.Iterator;
import java.util.Vector;

public class Directory extends Entry{
    private String name;
    private Vector directory = new Vector();

    public Directory(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getSize() {
        // 再帰的にサイズ取得
        int size = 0;
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            size += entry.getSize();
        }
        return size;
    }

public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }

    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.printList(prefix + "/" + name);
        }
    }
}
