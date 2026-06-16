package DesignPattern.BuilderPattern;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .setCPU("intel i7")
                .setRAM(16)
                .setStorage(1064)
                .build();


        computer.display();
    }
}
