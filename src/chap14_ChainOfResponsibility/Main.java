package chap14_ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Support alice = new NoSupport("Alice");
        Support bob = new LimitSupport("Bob", 5);
        Support charlie = new OddSupport("Charlie");

        alice.setNext(bob).setNext(charlie);
        for (int i = 0; i < 10; i++) {
            alice.support(new Trouble(i));

        }
    }
}
