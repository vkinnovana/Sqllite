package com.tarotlife.tarot.card.reading.numerology.horoscope.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetDailyHoroscopeForMonthResult {
    @SerializedName("EC")
    @Expose
    private Integer ec;
    @SerializedName("ISEX")
    @Expose
    private Boolean isex;
    @SerializedName("RV")
    @Expose
    private Rv rv;

    public Integer getEc() {
        return ec;
    }

    public void setEc(Integer ec) {
        this.ec = ec;
    }

    public Boolean getIsex() {
        return isex;
    }

    public void setIsex(Boolean isex) {
        this.isex = isex;
    }

    public Rv getRv() {
        return rv;
    }

    public void setRv(Rv rv) {
        this.rv = rv;
    }

}
