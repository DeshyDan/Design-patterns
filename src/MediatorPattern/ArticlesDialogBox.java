package MediatorPattern;

public class ArticlesDialogBox extends Dialog {
    private ListBox listBox = new ListBox(this);
    private Button button = new Button(this);
    private TextBox textBox = new TextBox(this);

    public void simulateUserInteraction(){
        listBox.setSelection("action 1");
        System.out.println("TextBox:"+ textBox.getContent());
        System.out.println("Button:" + button.isEnabled());
    }

    private void titleChanged() {
        var content = textBox.getContent();

        var isEmpty = (content == null | content.isEmpty());

        button.setEnabled(!isEmpty);

    }

    private void articlesSelected() {
        textBox.setContent(listBox.getSelection());
        button.setEnabled(true);
    }

    @Override
    public void changed(UIControl control) {
        if (control == listBox)
            articlesSelected();
        else if (control == textBox)
            titleChanged();

    }
}
