package com.example.coolweather0.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 蒲公英之流 on 2019-02-08.
 */

public class City extends DataSupport {

    private int id;
    private String cityName;
    private int CityCode;
    private int provinceId;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return CityCode;
    }
    public void setCityCode(int cityCode) {
        CityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }
    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
