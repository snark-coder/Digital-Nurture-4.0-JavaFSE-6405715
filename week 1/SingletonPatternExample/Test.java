package SingletonPatternExample;


public class Test {
    public static void main(String[] args){
        try{
            Logger logger = Logger.get_instance();
            
        }catch(Exception e){
            System.out.println("Exception occured!");
        }

        
    }
}
