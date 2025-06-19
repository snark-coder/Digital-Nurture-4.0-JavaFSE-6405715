package DecoratorPatternExample;

public class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(Notifier notifier){
        super(notifier);
    }

     public void send(){
        System.out.println("This is a sms notification.");
    }
}
