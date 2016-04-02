package com.is.model.Response;

import com.is.model.Table.CitiesBean;

import java.util.List;

/**
 * Created by George on 2016/3/29.
 */
public class cities {

    private int errno;
    private String msg;


    private List<CitiesBean> cities;

    public int getErrno() {
        return errno;
    }

    public void setErrno(int errno) {
        this.errno = errno;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<CitiesBean> getCities() {
        return cities;
    }

    public void setCities(List<CitiesBean> cities) {
        this.cities = cities;
    }

}
