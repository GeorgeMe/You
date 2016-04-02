package com.is.model;

import java.util.List;

/**
 * Created by George on 2016/3/29.
 */
public class searchshops {

    private int errno;
    private String msg;

    private DataBean data;

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

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private int total;
        private List<ShopsBean> shops;
        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<ShopsBean> getShops() {
            return shops;
        }

        public void setShops(List<ShopsBean> shops) {
            this.shops = shops;
        }

        public static class ShopsBean {
            private int shop_id;
            private String shop_name;
            private double longitude;
            private double latitude;
            private double distance;
            private Object deal_num;
            private String shop_url;
            private String shop_murl;
            private List<?> deals;

            public int getShop_id() {
                return shop_id;
            }

            public void setShop_id(int shop_id) {
                this.shop_id = shop_id;
            }

            public String getShop_name() {
                return shop_name;
            }

            public void setShop_name(String shop_name) {
                this.shop_name = shop_name;
            }

            public double getLongitude() {
                return longitude;
            }

            public void setLongitude(double longitude) {
                this.longitude = longitude;
            }

            public double getLatitude() {
                return latitude;
            }

            public void setLatitude(double latitude) {
                this.latitude = latitude;
            }

            public double getDistance() {
                return distance;
            }

            public void setDistance(double distance) {
                this.distance = distance;
            }

            public Object getDeal_num() {
                return deal_num;
            }

            public void setDeal_num(Object deal_num) {
                this.deal_num = deal_num;
            }

            public String getShop_url() {
                return shop_url;
            }

            public void setShop_url(String shop_url) {
                this.shop_url = shop_url;
            }

            public String getShop_murl() {
                return shop_murl;
            }

            public void setShop_murl(String shop_murl) {
                this.shop_murl = shop_murl;
            }

            public List<?> getDeals() {
                return deals;
            }

            public void setDeals(List<?> deals) {
                this.deals = deals;
            }
        }
    }
}
