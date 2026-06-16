package DesignPattern.ProxyPattern;

public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("selfie.jpg");

        System.out.println("first Display:");
        image.display();
        System.out.println("second Display:");
        image.display();
    }
}
