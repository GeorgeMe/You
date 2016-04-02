package com.is.model.Table;

import java.util.List;

/**
 * Created by George on 2016/4/2.
 */
public class DistrictsBean {

    private String district_name;
    private int district_id;
    private List<BizAreasBean> biz_areas;

    public String getDistrict_name() {
        return district_name;
    }

    public void setDistrict_name(String district_name) {
        this.district_name = district_name;
    }

    public int getDistrict_id() {
        return district_id;
    }

    public void setDistrict_id(int district_id) {
        this.district_id = district_id;
    }

    public List<BizAreasBean> getBiz_areas() {
        return biz_areas;
    }

    public void setBiz_areas(List<BizAreasBean> biz_areas) {
        this.biz_areas = biz_areas;
    }


}

