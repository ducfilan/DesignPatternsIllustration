import java.util.*;

public class WeatherData implements Subject {
    private ArrayList observers;
    private WeatherInfo weatherInfo;

    public WeatherData(){
        observers = new ArrayList();
    }

    public void registerObserver(Observer o){
        observers.add(o);
    }
    public void removeObserver(Observer o){
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }
    public void notifyObservers(){
        for(int i = 0; i < observers.size(); i++){
            Observer observer = (Observer)observers.get(i);
            observer.update(weatherInfo);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        WeatherInfo weatherInfo = new WeatherInfo(temperature, humidity, pressure);
        setMeasurements(weatherInfo);
    }

    public void setMeasurements(WeatherInfo weatherInfo){
        this.weatherInfo = weatherInfo;

        measurementsChanged();
    }
}
