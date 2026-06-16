package DesignPattern.FactoryPattern;

public class PdfDocument implements Document{
    @Override
    public void create(){
        System.out.println("Create PDF document");
    }
}
