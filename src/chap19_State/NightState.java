package chap19_State;

public class NightState implements State {
    private static NightState singleton = new NightState();

    private NightState() {
    }

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (9 <= hour || hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("金庫使用（夜間）");

    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("非常ベル（夜間）");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("通常の電話（夜間）");
    }

    public String toString() {
        return "[夜間]";
    }
}
