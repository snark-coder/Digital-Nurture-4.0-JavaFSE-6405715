package MVCPatternExample;

public class Main {
    public static void main(String[] args){
        Student student = new Student("Durga", 42, 'A');

        StudentController cont = new StudentController(student);
        cont.updateName("Erum");

        StudentView view = new StudentView(student);
        view.displayStudentDetails();
    }
}
