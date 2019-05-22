package chap13_Visitor;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Making root");
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            rootdir.add(bindir);
            bindir.add(new File("vim", 10000));
            bindir.add(new File("latex", 20000));
            rootdir.accept(new ListVisitor());
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
