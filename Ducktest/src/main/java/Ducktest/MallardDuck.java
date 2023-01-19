package Ducktest;
//subclase de Duck

public class MallardDuck extends Duck {
 //Constructor, asigna a las varibales de instancia de fb y qb
    public MallardDuck(FlyBehavior fb, QuackBehavior qb) {
        super(fb, qb);
    }
  
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}