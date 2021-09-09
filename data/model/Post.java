package com.tarotlife.tarot.card.reading.numerology.horoscope.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post {

    //String Day,String Month,String LanguageCode,String Year
    @SerializedName("Day")
    @Expose
    private String Day;

    @SerializedName("Month")
    @Expose
    private String Month;

    @SerializedName("LanguageCode")
    @Expose
    private String LanguageCode;

    @SerializedName("Year")
    @Expose
    private String Year;

    public String getDay() {
        return Day;
    }

    public void setDay(String Day) {
        this.Day = Day;
    }
    public String getMonth() {
        return Month;
    }
    public void setMonth(String Month) {
        this.Month = Month;
    }

    public String getLanguageCode() {
        return LanguageCode;
    }

    public void setLanguageCode(String LanguageCode) {
        this.LanguageCode = LanguageCode;
    }

    public String getYear() {
        return Year;
    }
    public void setYear(String Year) {
        this.Year = Year;
    }


    public Post(String day, String month, String languageCode, String year) {
        Day = day;
        Month = month;
        LanguageCode = languageCode;
        Year = year;
    }

    @Override
    public String toString() {
        return "Post{" +
                "Day='" + Day + '\'' +
                ", Month='" + Month + '\'' +
                ", LanguageCode=" + LanguageCode +
                ", Year=" + Year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Post post = (Post) o;

        if (Day != null ? !Day.equals(post.Day) : post.Day != null) return false;
        if (Month != null ? !Month.equals(post.Month) : post.Month != null) return false;
        if (LanguageCode != null ? !LanguageCode.equals(post.LanguageCode) : post.LanguageCode != null) return false;

        return Year != null ? Year.equals(post.Year) : post.Year == null;

    }

    @Override
    public int hashCode() {
        int result = Day != null ? Day.hashCode() : 0;
        result = 31 * result + (Month != null ? Month.hashCode() : 0);
        result = 31 * result + (LanguageCode != null ? LanguageCode.hashCode() : 0);
        result = 31 * result + (Year != null ? Year.hashCode() : 0);
        return result;
    }
}