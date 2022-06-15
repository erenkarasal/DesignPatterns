import java.util.ArrayList;

public class WeatherData extends Observable implements Subject {
    private ArrayList observers;
    private float temperature;
    private float pressure;
    private float humidity;
    public WeatherData(){
        observers = new ArrayList();
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i>=0) {observers.remove(i);}
    }

    @Override
    public void notifyObservers() {
    for (int i =0;i<observers.size();i++){
        Observer observer= (Observer)observers.get(i);
        observer.update(temperature,pressure,humidity);
    }
    }
    public void measurementChanged(){
        notifyObservers();
    }
    public void setMeaseurements(float temperature,float humidity, float pressure){
        this.humidity=humidity;
        this.pressure=pressure;
        this.temperature=temperature;
        measurementChanged();
    }
}
