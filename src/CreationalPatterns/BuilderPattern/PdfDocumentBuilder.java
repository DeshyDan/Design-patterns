package CreationalPatterns.BuilderPattern;

public class PdfDocumentBuilder implements PresentationBuilder {
private PDF document = new PDF();
    @Override
    public void addSlide(Slide slide) {
        document.addPage(slide.getText());
        
    }
    public PDF getPdfDocument() {
        return document;
    }
    
}
