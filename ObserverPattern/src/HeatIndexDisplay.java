public class HeatIndexDisplay implements Observer,DisplayElemnt{
    float heatIndex=0.0f;
    private WeatherData weatherData;
    public  HeatIndexDisplay(WeatherData weatherData){
        this.weatherData=weatherData;
    }
    @Override
    public void display() {

    }

    @Override
    public void update(float t, float rh, float pressure) {
    heatIndex=computeHeatIndex(t,rh);
    }

    private float computeHeatIndex(float t, float rh) {

return 0;
    }


}
