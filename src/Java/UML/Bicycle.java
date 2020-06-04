package UML;

public class Bicycle implements Car {
    //泛化关系，小车，自行车都是车
    public Bicycle(){}
    public void getName(){
        System.out.println("This is Bicycle");
    }
}
