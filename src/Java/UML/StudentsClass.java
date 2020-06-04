package UML;

public class StudentsClass {
    private Student [] students;
    StudentsClass(int Number){
        students = new Student[Number];
        //聚合关系，即使没有学生该班级还是存在
    }
}
