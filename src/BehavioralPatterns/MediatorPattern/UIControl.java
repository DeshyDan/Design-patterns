package BehavioralPatterns.MediatorPattern;

public class UIControl {
    protected Dialog owner;

    public UIControl(Dialog owner) {
        this.owner = owner;
    }
}
