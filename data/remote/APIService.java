package com.tarotlife.tarot.card.reading.numerology.horoscope.data.remote;
import com.tarotlife.tarot.card.reading.numerology.horoscope.data.model.GetDailyHoroscopeMainResult;
import com.tarotlife.tarot.card.reading.numerology.horoscope.data.model.Post;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIService {

    @POST("GetDailyHoroscopeForMonth")
    Call<GetDailyHoroscopeMainResult> savePost(@Body Post post);
}
