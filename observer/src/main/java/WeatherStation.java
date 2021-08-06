public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasuremennts(80, 65, 30.4f);
        System.out.println("=================================================");
        weatherData.setMeasuremennts(82, 70, 29.2f);
        System.out.println("=================================================");
        weatherData.setMeasuremennts(78, 90, 29.2f);

    }
}