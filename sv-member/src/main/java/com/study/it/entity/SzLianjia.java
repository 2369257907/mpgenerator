package com.study.it.entity;
import java.io.Serializable;
/**
 * <p>
 * 
 * </p>
 *
 * @author CQW
 * @since 2022-05-29
 */
public class SzLianjia implements Serializable {

    private static final long serialVersionUID = 1L;

    private String city;

    private String title;

    private String releaseTime;

    private String price;

    private String rentMethod;

    private String houseType;

    private String floor;

    private String direction;

    private String subway;

    private String xiaoqu;

    private String jingdu;

    private String picture;

    private String weidu;

    private String introduction;

    private String time;

    private String url;

    private String heyanma;

    private String position;

    private Double size;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRentMethod() {
        return rentMethod;
    }

    public void setRentMethod(String rentMethod) {
        this.rentMethod = rentMethod;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getSubway() {
        return subway;
    }

    public void setSubway(String subway) {
        this.subway = subway;
    }

    public String getXiaoqu() {
        return xiaoqu;
    }

    public void setXiaoqu(String xiaoqu) {
        this.xiaoqu = xiaoqu;
    }

    public String getJingdu() {
        return jingdu;
    }

    public void setJingdu(String jingdu) {
        this.jingdu = jingdu;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getWeidu() {
        return weidu;
    }

    public void setWeidu(String weidu) {
        this.weidu = weidu;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHeyanma() {
        return heyanma;
    }

    public void setHeyanma(String heyanma) {
        this.heyanma = heyanma;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "SzLianjia{" +
        ", city=" + city +
        ", title=" + title +
        ", releaseTime=" + releaseTime +
        ", price=" + price +
        ", rentMethod=" + rentMethod +
        ", houseType=" + houseType +
        ", floor=" + floor +
        ", direction=" + direction +
        ", subway=" + subway +
        ", xiaoqu=" + xiaoqu +
        ", jingdu=" + jingdu +
        ", picture=" + picture +
        ", weidu=" + weidu +
        ", introduction=" + introduction +
        ", time=" + time +
        ", url=" + url +
        ", heyanma=" + heyanma +
        ", position=" + position +
        ", size=" + size +
        "}";
    }
}
