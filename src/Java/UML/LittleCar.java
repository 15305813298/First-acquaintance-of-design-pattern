package UML;

public class LittleCar implements Car {
    //实现接口，小车自行车都是车
    public LittleCar(){}
    public void getName(){
        System.out.println("this is LittleCar");
    }

    class engineer{

    }
    //组合关系 轮胎 引擎都是小汽车的一部分
    class tyre{

    }
}
