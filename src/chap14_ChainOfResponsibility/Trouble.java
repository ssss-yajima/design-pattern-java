package chap14_ChainOfResponsibility;

public class Trouble {
    private int number;

    public Trouble(int numer) {
        this.number = numer;
    }
    public int getNumber() {
        return number;
    }
    public String toString() {
        return "[Trouble " + number + "]";
    }
}
