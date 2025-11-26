package aa90_DesignPatterns.Behavioral.aa972_Observer;

public class WeatherStation
{
    public static void main(String[] args)
    {
        // Subject : WeatherData
        // Observers :
        // To notify all observers at a time without violating OCP can be done via interface implementation

        WeatherData weatherData = new WeatherData();
        weatherData.setParams(35.5f, 44.4f, 90.0f);

        AverageStatsDisplay averageStatsDisplay = new AverageStatsDisplay();
        CurrentStatsDisplay currentStatsDisplay = new CurrentStatsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        // Subject is able to register any number of numbers
        weatherData.registerObserver(averageStatsDisplay);
        weatherData.registerObserver(currentStatsDisplay);
        weatherData.registerObserver(forecastDisplay);

        weatherData.setParams(55.3f, 64.9f, 92.1f);

        weatherData.removeObserver(currentStatsDisplay);
        weatherData.setParams(3.3f, 6.9f, 2.1f);

        // Observer take ownership and registering themselves with the subject intended :  but only if controls were given
        currentStatsDisplay.setSubject(weatherData); // if we need the observer to be registered with
        // only one subject at a time by making this local variable
        currentStatsDisplay.registerWithSubject();
        weatherData.setParams(59.3f, 68.9f, 99.1f);

    }
}
