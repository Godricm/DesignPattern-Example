package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-27 13:27
 * @description:
 **/
public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model=retrieveStudentFromDatabase();
        StudentView view=new StudentView();
        StudentController controller=new StudentController(model,view);

        controller.updateView();
        controller.setStudentName("john");
        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}
