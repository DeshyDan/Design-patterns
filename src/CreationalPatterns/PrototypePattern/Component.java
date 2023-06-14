package CreationalPatterns.PrototypePattern;

public interface Component{
    void render();
    Component clone();
}