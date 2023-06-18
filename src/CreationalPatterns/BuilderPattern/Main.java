package CreationalPatterns.BuilderPattern;

public class Main {
    public static void main(String[] args) {
        var presentation = new Presentation();
         presentation.addSlide(new Slide("SLide 1"));
         presentation.addSlide(new Slide("Slide 2"));


        var builder = new PdfDocumentBuilder();
         presentation.export(builder);

         builder.getPdfDocument();
    }
}
