package less7;

import java.io.IOException;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
public class Controller {

    private WeatherModel weatherModel = new AccuweatherModel();
    private Map<Integer, Period> variants = new HashMap<>();

    public Controller() {
        variants.put(5, Period.FIVE_DAY);

    }

    public void getWeather(String userInput, String selectedCity) throws IOException {
        Integer userIntegerInput = Integer.parseInt(userInput);

        switch (variants.get(userIntegerInput)) {

            case FIVE_DAY:
                weatherModel.getWeather(selectedCity, Period.FIVE_DAY);
                break;

        }
    }
}
