
package Clima;

 public class WeatherData implements subject {
    
    
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void registerObserver(CurrentConditions currentConditions) {

    }

    @Override
    public void removeObserver() {
    }
  
    @Override
    public void notifyObservers() {

    }
    
    public void getHumidity() {

    }
    public void getTemperature() {

    }
    public void getPressure() {

    }
    public void measurementsChanged() {

    }

   
}

