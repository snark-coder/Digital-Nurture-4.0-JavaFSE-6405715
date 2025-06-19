package FactoryMethodPatternExample;

public class ConcreteWord extends DocumentFactory implements WordDocument{

    @Override
    public void printWordData(){
        System.out.println("This method prints the excel data");
    }

    public void createDocument(){
       System.out.println("This is an implementation of Document Factory class method.") ;
    }
}
