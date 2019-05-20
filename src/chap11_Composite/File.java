package chap11_Composite;

public class File extends Entry{
    private String name;
    private int size;
    public File(String name , int size) {
        this.name = name;
        this.size = size;
    }
    public String getName() {
        return name;
    }
    public int getSize() {
        return size;
    }

    protected void printList(String prefix) {
        // thisでtoStringが返ってくる。以下は同じ意味。
        // prefix + this
        // prefix + this.toString()
        // prefix + toString()

        System.out.println(prefix + "/" + this);
    }
}
