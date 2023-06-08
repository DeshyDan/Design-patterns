package StrategyPattern;

public class ImageStorage {

    public void Store(String fileName, Compressor compressor, Filter filter) {

        compressor.compress(fileName);
        filter.apply(fileName);
    }

}