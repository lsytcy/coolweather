package com.example.coolweather.db;

public class Country   extends DataSupport{

    private  int id;

    private String countryName;

    private String weatherId;

    private int cityId;

    public int getId(int id) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.id = id;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId
    }
}
