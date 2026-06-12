package FactoryPattern;

public class ExcelDocument implements Document{
    @Override
    public void create(){
        System.out.println("Create Excel Document");
    }
}
