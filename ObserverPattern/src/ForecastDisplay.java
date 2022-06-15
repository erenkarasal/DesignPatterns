public class ForecastDisplay implements Observer,DisplayElemnt{
    @Override
    public void display() {

        System.out.println("Avg/Max/Min temperature = " );
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        float tempSum=0;
         tempSum += temp;
         int numReadings=0;
        float maxTemp=0;
        float minTemp=0;
        if (temp >  maxTemp) {
            maxTemp = temp;
        }
        if (temp <  minTemp) {
            minTemp = temp;
        }
        numReadings++;
        display();
    }
}
