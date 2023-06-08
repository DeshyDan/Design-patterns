package TemplateMethodPattern;

public class GenerateReport extends Task {

    @Override
    protected void doExecute() {
     System.out.println("Generating report");
    }
    
}
