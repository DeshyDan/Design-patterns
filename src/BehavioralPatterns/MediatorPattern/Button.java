package BehavioralPatterns.MediatorPattern;

public class Button extends UIControl {
     private boolean isEnabled;
    public Button(Dialog owner) {
        super(owner);
    }

   

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        this.isEnabled = enabled;
        owner.changed(this);
    }
}
