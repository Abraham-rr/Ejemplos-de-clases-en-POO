package Ducktest;

//subclase de Duck 
public class BallonDuck extends Duck {
   //Constructor, asigna a las varibales de instancia de fb y qb
    public BallonDuck(FlyBehavior fb, QuackBehavior qb) {
        super(fb, qb);
    }

    public void display() {
        System.out.println("I'm a Ballon duck");
    }
}
