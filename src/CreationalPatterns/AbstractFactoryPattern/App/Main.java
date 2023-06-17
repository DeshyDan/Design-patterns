package CreationalPatterns.AbstractFactoryPattern.App;

import CreationalPatterns.AbstractFactoryPattern.Ant.AntWidgetFactory;

public class Main {
    public static void main(String[] args) {
       new ContactForm().render(new AntWidgetFactory());  
    }
   
}
