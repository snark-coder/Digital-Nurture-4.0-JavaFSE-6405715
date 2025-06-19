package FactoryMethodPatternExample;

public class ConcreteExcel extends DocumentFactory implements  ExcelDocument {
    @Override
    public void printExcelData(){
        System.out.println("This method prints the excel data");
    }

    public void createDocument(){
       System.out.println("This is an implementation of Document Factory class method.");
    }
}
