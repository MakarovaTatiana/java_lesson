package lesson9;

import less7.Project.entity.Weather;

import java.io.IOException;
import java.util.List;

public interface WeatherModel {
    void getWeather(String selectedCity, Period period) throws IOException;
    public List<Weather> getSavedToDBWeather();
}
