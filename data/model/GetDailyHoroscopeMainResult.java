package com.tarotlife.tarot.card.reading.numerology.horoscope.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetDailyHoroscopeMainResult {

    @SerializedName("GetDailyHoroscopeForMonthResult")
    @Expose
    private GetDailyHoroscopeForMonthResult getDailyHoroscopeForMonthResult;

    public GetDailyHoroscopeForMonthResult getGetDailyHoroscopeForMonthResult() {
        return getDailyHoroscopeForMonthResult;
    }

    public void setGetDailyHoroscopeForMonthResult(GetDailyHoroscopeForMonthResult getDailyHoroscopeForMonthResult) {
        this.getDailyHoroscopeForMonthResult = getDailyHoroscopeForMonthResult;
    }

}
