package com.example.zhaozhiwen.retrofittest;

/**
 * Created by zhaozhiwen on 2016/4/21.
 */
public class Spoken {
    private String iso_639_1;
    private String name;

    public Spoken(String iso_639_1, String name) {
        this.iso_639_1 = iso_639_1;
        this.name = name;
    }

    public String getIso_639_1() {
        return iso_639_1;
    }

    public void setIso_639_1(String iso_639_1) {
        this.iso_639_1 = iso_639_1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Spoken{" +
                "iso_639_1='" + iso_639_1 + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
