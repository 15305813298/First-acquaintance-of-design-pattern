package UML;

public class Bicycle implements Car {
    //实现接口，小车，自行车都是车
    public Bicycle(){}
    public void getName(){
        System.out.println("This is Bicycle");
    }
}
