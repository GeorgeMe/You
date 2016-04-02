package com.is.model.Response;

import com.is.model.Table.BizAreasBean;
import com.is.model.Table.DistrictsBean;

import java.util.List;

/**
 * Created by George on 2016/3/29.
 */
public class districts {

    private int errno;
    private String msg;
    private List<DistrictsBean> districts;


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

    public List<DistrictsBean> getDistricts() {
        return districts;
    }

    public void setDistricts(List<DistrictsBean> districts) {
        this.districts = districts;
    }

}
