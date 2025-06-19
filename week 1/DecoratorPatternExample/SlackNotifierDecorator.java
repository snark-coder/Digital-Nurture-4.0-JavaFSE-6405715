package DecoratorPatternExample;

public class SlackNotifierDecorator extends NotifierDecorator  {
    public SlackNotifierDecorator(Notifier notifier){
        super(notifier);
    }

    public void send(){
        System.out.println("This is a slack notification.");
    }
}
