package DesignPattern.DecoratorPattern;

public class SlackNotifierDecrator extends NotifierDecorator {
    public SlackNotifierDecrator(Notifier notifier) {
        super(notifier);
    }
    @Override
    public void send(){
        super.send();
        System.out.println(" + Slack Notifier");
    }
}
