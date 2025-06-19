package DecoratorPatternExample;

// this design pattern is used to add new functionality dynamically without changing the structure.
// there are wrapper classes that add new functionalities
public class EmailNotifier implements Notifier {
    public void send(){
        System.out.println("Sending an email notification.");
    }

    public static void main(String[] args){
        Notifier notifier = new EmailNotifier();
        notifier.send();

        notifier = new SlackNotifierDecorator(notifier);
        notifier.send();

        notifier = new SMSNotifierDecorator(notifier);
        notifier.send();
    }
}
