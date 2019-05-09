package chap05_Singleton;

public class Singleton {
    private static Singleton singleton = new Singleton();
    // SingletonのコンストラクタはPrivate
    private Singleton(){
        System.out.println("インスタンスを生成しました");
    }
    public static Singleton getInstance(){
        return singleton;
    }
}
