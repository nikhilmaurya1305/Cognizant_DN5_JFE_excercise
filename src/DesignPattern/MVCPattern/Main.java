package DesignPattern.MVCPattern;

public class Main {
    public static void main(String[] args) {
        Student model = new Student("Nikhil",1,"A+");
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model,view);

        controller.updateDetail(model, view);

        controller.setName("Nakul");
        controller.setGrade("F");

        controller.updateDetail(model, view);
    }
}
