package com.is.model.Response;

import com.is.model.Table.ShopsBean;

import java.util.List;

/**
 * Created by George on 2016/3/29.
 */
public class dealshops {

    private int errno;
    private String msg;

    private List<ShopsBean> shops;

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

    public List<ShopsBean> getShops() {
        return shops;
    }

    public void setShops(List<ShopsBean> shops) {
        this.shops = shops;
    }

}
