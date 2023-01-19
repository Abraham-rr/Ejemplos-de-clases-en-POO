package Ducktest;

//clase Duck
public class Duck {
// tendremos los metodos Fly.. y Quack.. 
    FlyBehavior fb;
    QuackBehavior qb;

// tomaran dos argumentos, instancian dos variables llamados fb y qb
    public Duck(FlyBehavior fb, QuackBehavior qb) {
        this.fb = fb;
        this.qb = qb;
    }

  // el metodo performFly  se llama fly para la variable fly
    public void performFly() {
        fb.fly();
    }
    public void performQuack() {
        qb.quack();
    }
    // los ducks flotan 
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
    // son reales Duck
    public void display() {
        System.out.println("I'm a real Duck");
    }
    // sera la funccion display 
    public void showDuck() {
        display();
        performFly();
        performQuack();
        swim();
    }
}
