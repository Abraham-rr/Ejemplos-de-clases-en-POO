
package Ducktest;
//subclase de Duck

public class RedHeadDuck extends Duck {
 //Constructor, asigna a las varibales de instancia de fb y qb
    public RedHeadDuck(FlyBehavior fb, QuackBehavior qb) {
        super(fb, qb);
    }
 
    public void display() {
        System.out.println("I'm a real Redhead duck");
    }
}