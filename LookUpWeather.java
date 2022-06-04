package lesson6;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;


public class LookUpWeather {
    public static void main(String[] args) throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient();
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme("https")
                .host("dataservice.accuweather.com")
                .addPathSegment("forecasts")
                .addPathSegment("v1")
                .addPathSegment("daily")
                .addPathSegment("5day")
                .addPathSegment("291102")
                .addQueryParameter("apikey", "xZo6nS5KVvHceCOpdH1cYn9PODEVEnDF")
                .addQueryParameter("language", "en")
                .addQueryParameter("details", "true")
                .addQueryParameter("metric", "true")
                .build();

        Request request = new Request.Builder()
                .url(httpUrl)
                .addHeader("Content-Type", "application/json")
                .build();

        Response response = okHttpClient.newCall(request).execute();

        System.out.println(response.isSuccessful());
        System.out.println(response.code());
        System.out.println(response.headers());
        System.out.println(response.body().string());
    }
}
