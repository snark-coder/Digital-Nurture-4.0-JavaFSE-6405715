package MVCPatternExample;

public class StudentController {
    Student student;

    public StudentController(Student student){
        this.student = student;
    }

    void updateName(String name){
        student.name = name;
    }

    void updateName(int id){
        student.id = id;
    }

    void updateGrade(char grade){
        student.grade = grade;
    }
}
