package com.jk.model;

import java.io.Serializable;

/**
 * Created by 杨棋洋 on 2018/4/7.
 */
public class product_category implements Serializable {
    private static final long serialVersionUID = -3201372816573784541L;

    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        product_category that = (product_category) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        return name != null ? name.equals(that.name) : that.name == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "product_category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
