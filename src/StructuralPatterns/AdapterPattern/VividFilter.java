package StructuralPatterns.AdapterPattern;

public class VividFilter implements Filter {

    @Override
    public void apply(Image image) {
        System.out.println("Applying the vivid filter");
    }

}
