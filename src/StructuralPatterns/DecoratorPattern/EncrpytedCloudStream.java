package StructuralPatterns.DecoratorPattern;

public class EncrpytedCloudStream implements Stream {
    private Stream stream;

    public EncrpytedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        var encrpyt = encrpyt(data);

        stream.write(encrpyt);

    }

    private String encrpyt(String data) {
        return "@#$%$##@^%";
    }

}
