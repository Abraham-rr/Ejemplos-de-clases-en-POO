package Ducktest;

//tenemos el main 
public class Main {
    //definimos el metodo Main
    public static void main(String[] args) {
        //Creamos los objetos 
        Duck mallardDuck, redHead, decoyDuck, rubberDuck;
        
        //pasomos los arguemtnos de los cuales queremos que haga cada Duck 
        mallardDuck = new MallardDuck(new FlyWithWings(), new Quack());
        mallardDuck.showDuck();
        
        redHead = new RedHeadDuck(new FlyWithWings(), new Quack());
        redHead.showDuck();
        
        decoyDuck = new DecoyDuck(new FlyNoWay(), new MuteQuack());
        decoyDuck.showDuck();
        
        rubberDuck = new RubberDuck(new FlyNoWay(), new Squeak());
        rubberDuck.showDuck();
    
        System.exit(0);
    }
}