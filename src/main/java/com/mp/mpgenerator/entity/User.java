package com.mp.mpgenerator.entity;
import java.io.Serializable;
/**
 * <p>
 * 
 * </p>
 *
 * @author 
 * @since 2022-05-29
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer uid;

    private String uname;

    private String upwd;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    @Override
    public String toString() {
        return "User{" +
        ", uid=" + uid +
        ", uname=" + uname +
        ", upwd=" + upwd +
        "}";
    }
}
