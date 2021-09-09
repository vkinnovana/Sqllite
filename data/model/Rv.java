package com.tarotlife.tarot.card.reading.numerology.horoscope.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Rv {

    @SerializedName("DailyHoroscopeZodiac")
    @Expose
    private List<DailyHoroscopeZodiac> dailyHoroscopeZodiac = null;
    @SerializedName("Day")
    @Expose
    private Integer day;
    @SerializedName("Month")
    @Expose
    private Integer month;
    @SerializedName("Year")
    @Expose
    private Integer year;

    public List<DailyHoroscopeZodiac> getDailyHoroscopeZodiac() {
        return dailyHoroscopeZodiac;
    }

    public void setDailyHoroscopeZodiac(List<DailyHoroscopeZodiac> dailyHoroscopeZodiac) {
        this.dailyHoroscopeZodiac = dailyHoroscopeZodiac;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

}
