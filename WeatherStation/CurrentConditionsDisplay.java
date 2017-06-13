public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private WeatherInfo weatherInfo;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(WeatherInfo weatherInfo){
        this.weatherInfo = weatherInfo;
        display();
    }

    public void display(){
        System.out.println("Current conditions: " + weatherInfo.getTemperature() +
            "F degrees and " + weatherInfo.getHumidity() + "% humidity.");
    }
}
