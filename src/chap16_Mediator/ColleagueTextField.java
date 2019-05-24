package chap16_Mediator;

import javax.print.attribute.standard.Media;
import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class ColleagueTextField extends TextField implements TextListener, Colleague {
    private Mediator mediator;

    public ColleagueTextField(String text, int columns) {
        super(text, columns);
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
        setBackground(enabled ? Color.white : Color.lightGray);
    }
    // 文字列が変化したらMediatorに通知
    public void textValueChanged(TextEvent e){
        mediator.colleagueChanged(this);
    }
}
