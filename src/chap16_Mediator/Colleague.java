package chap16_Mediator;

public interface Colleague {

    public abstract void setMediator(Mediator mediator);
    // 自分の状態を自分で管理せず、Mediatorの支持に従う
    public abstract void setColleagueEnabled(boolean enabled);
}
