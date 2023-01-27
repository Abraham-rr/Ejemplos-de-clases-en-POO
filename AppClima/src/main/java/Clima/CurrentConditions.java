
package Clima;

public class CurrentConditions {
    private float temp;
    private float humidity;

    public CurrentConditions(subject weatherData) {
        weatherData.registerObserver(this);
    }

    
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

    
    public void update() {
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temp + "F degrees and " + humidity + "% humidity");
    }

}
