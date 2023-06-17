package CreationalPatterns.AbstractFactoryPattern.Ant;

import CreationalPatterns.AbstractFactoryPattern.TextBox;

public class AntTextBox implements TextBox {

    @Override
    public void render() {
        System.out.println("Ant textBox");
    }

}
