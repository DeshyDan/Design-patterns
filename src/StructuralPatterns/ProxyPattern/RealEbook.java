package StructuralPatterns.ProxyPattern;



public class RealEbook implements Ebook {
    private String fileName;

    public RealEbook(String fileName) {
        this.fileName = fileName;
        load();
    }

    @Override
    public void show() {
        System.out.println("showing the ebook " + fileName);
    }

    @Override
    public String getFileName(){
        return fileName;
    }

    private void load() {
        System.out.println("Loading the ebook " + fileName);
    }

}
