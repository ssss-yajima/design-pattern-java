package chap11_Composite;

public class Main {
    public static void main(String[] args) {
        try{
            System.out.println("Making root entries");
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            Directory usrdir = new Directory("usr");

            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);
            bindir.add(new File("vi", 10000));
            bindir.add(new File("latex", 2000));
            rootdir.printList();

            System.out.println("");
            System.out.println("Making user entries");
            Directory megane = new Directory("megane");
            Directory taro = new Directory("taro");
            usrdir.add(megane);
            usrdir.add(taro);
            megane.add(new File("blog", 100));
            megane.add(new File("hoge.txt", 200));

            rootdir.printList();
        }catch(FileTreatmentException e){
            e.printStackTrace();
        }
    }
}
