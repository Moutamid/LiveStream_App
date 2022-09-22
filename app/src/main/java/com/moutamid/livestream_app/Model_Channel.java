package com.moutamid.livestream_app;

public class Model_Channel {
    String name , des , cast , time ;
    int image1 ;

    public Model_Channel() {
    }

    public Model_Channel(String name, String des, String cast, String time, int image1) {
        this.name = name;
        this.des = des;
        this.cast = cast;
        this.time = time;
        this.image1 = image1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getImage1() {
        return image1;
    }

    public void setImage1(int image1) {
        this.image1 = image1;
    }
}
