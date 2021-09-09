package com.tarotlife.tarot.card.reading.numerology.horoscope.data.remote;

public class ApiUtils {

    private ApiUtils() {}

    public static final String BASE_URL = "http://192.168.1.24/HoroscopeService/Horoscope.svc/";

    public static APIService getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}
