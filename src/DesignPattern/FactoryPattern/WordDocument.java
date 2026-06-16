package DesignPattern.FactoryPattern;

public class WordDocument implements Document{
    @Override
    public void create(){
        System.out.println("Create Word Document");
    }
}
