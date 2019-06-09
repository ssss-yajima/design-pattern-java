package chap19_State;

// awtは割愛
public class SafeFrame implements Context{
    // singleton
    private State state = DayState.getInstance();

    //ボタンに応じて
    //state.doUse(this);
    //state.doAlarm(this);
    //state.doPhone(this);

    @Override
    public void setClock(int hour) {
        System.out.println("時刻は" + hour + "時です");
        state.doClock(this, hour);
    }

    @Override
    public void changeState(State state) {
        System.out.println("状態が" + this.state + "から"+ state + "に変化しました");
        this.state = state;
    }
    @Override
    public void callSecurityCenter(String msg) {
        System.out.println("警備センタ呼び出し！"+ msg);
    }

    @Override
    public void recordLog(String msg) {
        System.out.println("Record Log " + msg);
    }
}
