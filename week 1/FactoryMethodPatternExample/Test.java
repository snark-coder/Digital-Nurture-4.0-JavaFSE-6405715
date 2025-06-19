package FactoryMethodPatternExample;

public class Test {
    public static void main(String[] args){
        ConcreteExcel excel = new ConcreteExcel();
        excel.createDocument();
    }
}
