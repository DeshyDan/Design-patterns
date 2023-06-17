package CreationalPatterns.AbstractFactoryPattern.Ant;

import CreationalPatterns.AbstractFactoryPattern.Button;
import CreationalPatterns.AbstractFactoryPattern.TextBox;
import CreationalPatterns.AbstractFactoryPattern.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {

    @Override
    public Button createbutton() {
        return new AntButton();
    }

    @Override
    public TextBox createBox() {
       return new AntTextBox();
    }
    
}
