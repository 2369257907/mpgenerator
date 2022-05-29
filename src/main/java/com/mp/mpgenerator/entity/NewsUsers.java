package com.mp.mpgenerator.entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
/**
 * <p>
 * 
 * </p>
 *
 * @author 
 * @since 2022-05-29
 */
public class NewsUsers implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "usid", type = IdType.AUTO)
    private Integer usid;

    private String uname;

    private String upwd;

    public Integer getUsid() {
        return usid;
    }

    public void setUsid(Integer usid) {
        this.usid = usid;
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
        return "NewsUsers{" +
        ", usid=" + usid +
        ", uname=" + uname +
        ", upwd=" + upwd +
        "}";
    }
}
