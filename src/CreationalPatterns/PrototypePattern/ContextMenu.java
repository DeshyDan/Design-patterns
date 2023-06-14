package CreationalPatterns.PrototypePattern;

public class ContextMenu {
    public void duplicate(Component component) {
        Component newComponent = component.clone();
        // Add to document
    }
}
