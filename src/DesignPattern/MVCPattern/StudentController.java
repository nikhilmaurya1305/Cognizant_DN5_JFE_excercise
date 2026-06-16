package DesignPattern.MVCPattern;

public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setName(String name){
        model.setName(name);
    }
    public void setGrade(String grade){
        model.setGrade(grade);
    }

    public void updateDetail(Student model,StudentView view){
        view.displayStudentDetails(model.getName(), model.getId(), model.getGrade());
    }

}
