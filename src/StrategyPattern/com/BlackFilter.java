package StrategyPattern.com;

public class BlackFilter implements Filter {

    @Override
    public void apply(String fileName) {
        System.out.println("Applying a BLack filter");
    }

}
