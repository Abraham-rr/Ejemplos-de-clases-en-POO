
package Clima;


public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditions currentConditions = new CurrentConditions(weatherData);
        //weatherData.setMeasurements(76,60,29.4f);
        //weatherData.setMeasurements(30,43,28.0f);
    }
}
