package com.tarotlife.tarot.card.reading.numerology.horoscope.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DailyHoroscopeZodiac {

    @SerializedName("Content")
    @Expose
    private String content;
    @SerializedName("LanguageCode")
    @Expose
    private Integer languageCode;
    @SerializedName("LuckyColor")
    @Expose
    private String luckyColor;
    @SerializedName("LuckyNumber")
    @Expose
    private String luckyNumber;
    @SerializedName("ZodiacSign")
    @Expose
    private Integer zodiacSign;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(Integer languageCode) {
        this.languageCode = languageCode;
    }

    public String getLuckyColor() {
        return luckyColor;
    }

    public void setLuckyColor(String luckyColor) {
        this.luckyColor = luckyColor;
    }

    public String getLuckyNumber() {
        return luckyNumber;
    }

    public void setLuckyNumber(String luckyNumber) {
        this.luckyNumber = luckyNumber;
    }

    public Integer getZodiacSign() {
        return zodiacSign;
    }

    public void setZodiacSign(Integer zodiacSign) {
        this.zodiacSign = zodiacSign;
    }


}

//https://github.com/sumon953/POST-METHOD-with-Multiple-JSON-objects-in-android-studio