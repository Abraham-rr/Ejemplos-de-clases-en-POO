
package Ducktest;

public class MuteQuack implements QuackBehavior {
    //interface de QuackBehavior
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
