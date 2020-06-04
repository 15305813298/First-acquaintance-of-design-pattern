package UML;

public class Student {
    Student(){};
    Student(IdCard idCard){
        this.idCard = idCard;
    }
    private IdCard idCard;//关联关系
    public void depend(Bicycle by){
        //依赖关系
    }
}
