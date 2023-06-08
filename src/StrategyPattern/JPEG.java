package StrategyPattern;

public class JPEG implements Compressor {

    @Override
    public void compress(String fileName) {
        System.out.println("Compressing with JPEG");
    }

}
