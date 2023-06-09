package BehavioralPatterns.MediatorPattern;

public class TextBox extends UIControl {
    public TextBox(Dialog owner) {
        super(owner);
    }

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        owner.changed(this);
    }

}
