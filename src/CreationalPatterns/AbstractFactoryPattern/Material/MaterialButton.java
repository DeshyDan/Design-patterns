package CreationalPatterns.AbstractFactoryPattern.Material;

import CreationalPatterns.AbstractFactoryPattern.Button;

public class MaterialButton implements Button {

    @Override
    public void render() {
       System.out.println("Material Button");
    }
    
}
