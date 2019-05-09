package chap05_Singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        // 2つのobjが同じインスタンスか確認
        assert(obj1 == obj2);
    }
}
