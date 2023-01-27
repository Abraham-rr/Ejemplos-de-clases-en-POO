
package Clima;

public class ThirdPartyDisplay implements DisplayElement, Observer{
    
    @Override
    public void display() {

    }
    @Override
    public void update() {

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}