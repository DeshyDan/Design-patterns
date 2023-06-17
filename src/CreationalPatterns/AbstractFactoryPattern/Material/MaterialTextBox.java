package CreationalPatterns.AbstractFactoryPattern.Material;

import CreationalPatterns.AbstractFactoryPattern.TextBox;

public class MaterialTextBox implements TextBox {

    @Override
    public void render() {
        System.out.println("Material TextBox");
    }
    
}
