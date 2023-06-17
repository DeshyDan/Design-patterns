package CreationalPatterns.AbstractFactoryPattern.Material;

import CreationalPatterns.AbstractFactoryPattern.Button;
import CreationalPatterns.AbstractFactoryPattern.TextBox;
import CreationalPatterns.AbstractFactoryPattern.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory{

    @Override
    public Button createbutton() {
      return new MaterialButton();
    }

    @Override
    public TextBox createBox() {
      return new MaterialTextBox();
    }
    
}
