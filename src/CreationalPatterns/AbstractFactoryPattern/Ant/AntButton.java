package CreationalPatterns.AbstractFactoryPattern.Ant;

import CreationalPatterns.AbstractFactoryPattern.Button;

public class AntButton implements Button {

    @Override
    public void render() {
        System.out.println("Ant button");
    }

}
