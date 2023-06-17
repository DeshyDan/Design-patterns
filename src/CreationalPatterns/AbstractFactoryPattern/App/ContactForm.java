package CreationalPatterns.AbstractFactoryPattern.App;

import CreationalPatterns.AbstractFactoryPattern.WidgetFactory;

public class ContactForm {
    public void render(WidgetFactory factory) {
        factory.createbutton().render();
        factory.createBox().render();
    }
}
