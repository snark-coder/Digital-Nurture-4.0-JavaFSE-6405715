package MVCPatternExample;

public class StudentView {
    Student student;

    public StudentView(Student student){
        this.student = student;
    }
    void displayStudentDetails(){
        System.out.println("Name: "+student.name);
        System.out.println("Id: "+student.id);
        System.out.println("Grade: "+student.grade);
    }
}
