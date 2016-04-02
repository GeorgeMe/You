package com.is.model.Table;

/**
 * Created by George on 2016/4/2.
 */

import java.util.List;

public class CategoriesBean {

    private int cat_id;
    private String cat_name;
    private List<SubcategoriesBean> subcategories;

    public int getCat_id() {
        return cat_id;
    }

    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }

    public String getCat_name() {
        return cat_name;
    }

    public void setCat_name(String cat_name) {
        this.cat_name = cat_name;
    }

    public List<SubcategoriesBean> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(List<SubcategoriesBean> subcategories) {
        this.subcategories = subcategories;
    }

}
