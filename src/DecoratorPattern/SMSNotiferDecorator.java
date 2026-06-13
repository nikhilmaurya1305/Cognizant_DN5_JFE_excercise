package DecoratorPattern;

public class SMSNotiferDecorator extends NotifierDecorator{
    public SMSNotiferDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(){
        super.send();
        System.out.println(" + SMS Notifer");
    }
}
