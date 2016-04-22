package com.example.zhaozhiwen.retrofittest;

/**
 * Created by zhaozhiwen on 2016/4/21.
 */
public class Countries {
    private String iso_3166_1;
    private String name;

    public Countries(String iso_3166_1, String name) {
        this.iso_3166_1 = iso_3166_1;
        this.name = name;
    }

    public String getIso_3166_1() {
        return iso_3166_1;
    }

    public void setIso_3166_1(String iso_3166_1) {
        this.iso_3166_1 = iso_3166_1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Countries{" +
                "iso_3166_1='" + iso_3166_1 + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
