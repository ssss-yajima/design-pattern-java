package chap13_Visitor;

public interface Acceptor {
    public abstract void accept(Visitor visitor);
}
