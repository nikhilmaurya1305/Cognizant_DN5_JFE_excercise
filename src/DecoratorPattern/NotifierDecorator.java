package DecoratorPattern;

public abstract class NotifierDecorator implements Notifier {
    Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(){
        notifier.send();
    }
}
