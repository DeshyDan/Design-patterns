package BehavioralPatterns.Memento;

public class Editor {
    private EditorState editorState;
    private History history;

    public Editor() {
        history = new History();

    }

    public String getContent() {
        return history.getLastest().toString();
    }

    public void setContent(String content) {
        editorState = new EditorState(content);
        history.add(editorState);

    }

    public void undo() {
        editorState = history.restoreLast();

    }

}
