package com.is.model.Response;

import com.is.model.Table.DealBean;

/**
 * Created by George on 2016/3/29.
 */
public class dealdetail {


    private int errno;
    private String msg;

    private DealBean deal;

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

    public DealBean getDeal() {
        return deal;
    }

    public void setDeal(DealBean deal) {
        this.deal = deal;
    }

}
