package chap17_Observer;

public class GraphObserver implements Observer{
    public void update(NumberGenerator generator) {
        System.out.println("GraphGenerator:");
        int count = generator.getNumber();
        for (int i = 0; i < count; i++) {
            System.out.print("*");

        }
        System.out.println();
        try {
            Thread.sleep(100);

        } catch (InterruptedException e) {

        }
    }
}
