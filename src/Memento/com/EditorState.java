package Memento.com;

public class EditorState {
    private String content;

    public EditorState(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return content;
    }

}
