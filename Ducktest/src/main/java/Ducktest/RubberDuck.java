package Ducktest;

public class RubberDuck extends Duck {
  //Constructor, asigna a las varibales de instancia de fb y qb
    public RubberDuck(FlyBehavior fb, QuackBehavior qb) {
        super(fb, qb);
    }
   
    public void display() {
        System.out.println("I'm a Rubber duck");
    }
}
