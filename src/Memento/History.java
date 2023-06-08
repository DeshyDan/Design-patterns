package Memento;

import java.util.Stack;

public class History {
    Stack<EditorState> stack = new Stack<>();

    public void add(EditorState state) {
        stack.push(state);
    }

    public EditorState getLastest() {
        return stack.peek();
    }

    public EditorState restoreLast() {
        stack.pop();
        return stack.peek();
    }
}