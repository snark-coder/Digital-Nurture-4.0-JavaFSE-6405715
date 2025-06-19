package FactoryMethodPatternExample;

public class ConcretePdf extends DocumentFactory implements PdfDocument {
    @Override
    public void printPdfContent(){
        System.out.println("This method prints pdf data.");
    }

    public void createDocument(){
       System.out.println("This is an implementation of Document Factory class method.") ;
    }
}
