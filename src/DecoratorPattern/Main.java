package DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        Notifier notifier = new SMSNotiferDecorator(new SlackNotifierDecrator(new EmailNotifier()));

        notifier.send();
    }
}
