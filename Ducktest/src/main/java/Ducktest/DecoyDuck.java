package Ducktest;

//subclase de Duck 
public class DecoyDuck extends Duck {
     //Constructor, asigna a las varibales de instancia de fb y qb
    public DecoyDuck(FlyBehavior fb, QuackBehavior qb) {
        super(fb, qb);
    }
  
    public void display() {
        System.out.println("I'm a simple Decoy duck");
    }
}