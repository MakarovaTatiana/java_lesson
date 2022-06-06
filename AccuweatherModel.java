package less7;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
public class AccuweatherModel implements WeatherModel {
    //http://dataservice.accuweather.com/forecasts/v1/daily/5day/291102
    private static final String PROTOKOL = "https";
    private static final String BASE_HOST = "dataservice.accuweather.com";
    private static final String FORECASTS = "forecasts";
    private static final String VERSION = "v1";
    private static final String DAILY = "daily";
    private static final String FIVE_DAY = "5day";
    private static final String API_KEY = "xZo6nS5KVvHceCOpdH1cYn9PODEVEnDF";
    private static final String API_KEY_QUERY_PARAM = "apikey";
    private static final String LOCATIONS = "locations";
    private static final String CITIES = "cities";
    private static final String AUTOCOMPLETE = "autocomplete";
    private static final String LANG_QUERY_PARAM = "language";
    private static final String LANG = "ru";
    private static final String DETAILS_QUERY_PARAM = "details";
    private static final String DETAILS = "true";
    private static final String METRIC_QUERY_PARAM = "metric";
    private static final String METRIC = "true";


    private static final OkHttpClient okHttpClient = new OkHttpClient();
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public void getWeather(String selectedCity, Period period) throws IOException {
        switch (period) {
            case FIVE_DAY:
                HttpUrl httpUrl5Days = new HttpUrl.Builder()
                        .scheme(PROTOKOL)
                        .host(BASE_HOST)
                        .addPathSegment(FORECASTS)
                        .addPathSegment(VERSION)
                        .addPathSegment(DAILY)
                        .addPathSegment(FIVE_DAY)
                        .addPathSegment(detectCityKey(selectedCity))
                        .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                        .addQueryParameter(LANG_QUERY_PARAM, LANG)
                        .addQueryParameter(DETAILS_QUERY_PARAM, DETAILS)
                        .addQueryParameter(METRIC_QUERY_PARAM, METRIC)
                        .build();

                Request request5Days = new Request.Builder()
                        .url(httpUrl5Days)
                        .build();

                Response fiveDayForecastResponse = okHttpClient.newCall(request5Days).execute();
                String fiveDaysWeatherResponse = fiveDayForecastResponse.body().string();
                System.out.println(fiveDaysWeatherResponse);
                for (int i = 0; i <= 4; i++) {
                    String date5 = objectMapper.readTree(fiveDaysWeatherResponse).at("/DailyForecasts").get(i).at("/Date").asText();
                    String dateNew5 = date5.substring(0, date5.length() - 15);
                    String minTemperature5 = objectMapper.readTree(fiveDaysWeatherResponse).at("/DailyForecasts").get(i).at("/Temperature/Minimum/Value").asText();
                    String maxTemperature5 = objectMapper.readTree(fiveDaysWeatherResponse).at("/DailyForecasts").get(i).at("/Temperature/Maximum/Value").asText();
                    System.out.println(dateNew5  + ": температура воздуха от " + minTemperature5 + " до " + maxTemperature5 + " градусов.");
                }

                break;
        }
    }

    /*@Override
    public List<Weather> getSavedToDBWeather() {
        return dataBaseRepository.getSavedToDBWeather();
    }*/

    private String detectCityKey(String selectCity) throws IOException {
        //http://dataservice.accuweather.com/locations/v1/cities/autocomplete
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme(PROTOKOL)
                .host(BASE_HOST)
                .addPathSegment(LOCATIONS)
                .addPathSegment(VERSION)
                .addPathSegment(CITIES)
                .addPathSegment(AUTOCOMPLETE)
                .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                .addQueryParameter("q", selectCity)
                .build();

        Request request = new Request.Builder()
                .url(httpUrl)
                .get()
                .addHeader("accept", "application/json")
                .build();

        Response response = okHttpClient.newCall(request).execute();
        String responseString = response.body().string();

        String cityKey = objectMapper.readTree(responseString).get(0).at("/Key").asText();
        return cityKey;
    }
}
}
