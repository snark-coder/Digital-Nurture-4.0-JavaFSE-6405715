package SingletonPatternExample;

public class Logger {
    private static Logger logger = new Logger();
    private Logger(){
        System.out.println("A private instance is created! ");
    }

    public static Logger get_instance(){
        return logger;
    }
}


