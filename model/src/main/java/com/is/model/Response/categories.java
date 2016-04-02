package com.is.model.Response;

import com.is.model.Table.CategoriesBean;
import java.util.List;

/**
 * Created by George on 2016/3/29.
 */
public class categories {

    private int errno;
    private String msg;
    private List<CategoriesBean> categories;

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

    public List<CategoriesBean> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoriesBean> categories) {
        this.categories = categories;
    }

}
