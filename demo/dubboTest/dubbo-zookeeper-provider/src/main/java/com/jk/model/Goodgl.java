package com.jk.model;

import java.io.Serializable;

/**
 * Created by 杨棋洋 on 2018/4/7.
 */
public class Goodgl implements Serializable{
    private static final long serialVersionUID = -6289215424891291278L;

    private Integer sn;
    private String name;
    private Integer product_category;
   private Integer price;
    //业务字段
    private String name2;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getSn() {
        return sn;
    }

    public void setSn(Integer sn) {
        this.sn = sn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getProduct_category() {
        return product_category;
    }

    public void setProduct_category(Integer product_category) {
        this.product_category = product_category;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goodgl{" +
                "sn=" + sn +
                ", name='" + name + '\'' +
                ", product_category=" + product_category +
                ", price=" + price +
                '}';
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Goodgl goodgl = (Goodgl) o;

        if (sn != null ? !sn.equals(goodgl.sn) : goodgl.sn != null) return false;
        if (name != null ? !name.equals(goodgl.name) : goodgl.name != null) return false;
        if (product_category != null ? !product_category.equals(goodgl.product_category) : goodgl.product_category != null)
            return false;
        if (name2 != null ? !name2.equals(goodgl.name2) : goodgl.name2 != null) return false;
        return price != null ? price.equals(goodgl.price) : goodgl.price == null;

    }

    @Override
    public int hashCode() {
        int result = sn != null ? sn.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (product_category != null ? product_category.hashCode() : 0);
        result = 31 * result + (name2 != null ? name2.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }


}
