package pl.zzpj2020.solid.dip.weathertracker.solution;

public class WeatherTracker {
    String currentConditions;
    Communicator communicator;

    public WeatherTracker(Communicator communicator) {
        this.communicator = communicator;
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        if (weatherDescription == "rainy") {
            String alert = communicator.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
        if (weatherDescription == "sunny") {
            String alert = communicator.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
    }
}
