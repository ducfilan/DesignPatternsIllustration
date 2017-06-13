public class WeatherInfo {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherInfo(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity    = humidity;
        this.pressure    = pressure;
    }

    public float getTemperature(){
        return this.temperature;
    }

    public float getHumidity(){
        return this.humidity;
    }

    public float getPressure(){
        return this.pressure;
    }
}
