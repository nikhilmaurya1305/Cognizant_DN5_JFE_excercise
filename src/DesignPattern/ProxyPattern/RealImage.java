package DesignPattern.ProxyPattern;

public class RealImage implements Image {
    private String fileName;
    public RealImage(String filename) {
        this.fileName = filename;
        loadFile();
    }
    private void loadFile() {
        System.out.println("Loading file: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}
