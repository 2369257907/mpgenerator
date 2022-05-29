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
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer cid;

    private String cauthor;

    private String ccontent;

    private String cdate;

    private String cip;

    private Integer cnid;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCauthor() {
        return cauthor;
    }

    public void setCauthor(String cauthor) {
        this.cauthor = cauthor;
    }

    public String getCcontent() {
        return ccontent;
    }

    public void setCcontent(String ccontent) {
        this.ccontent = ccontent;
    }

    public String getCdate() {
        return cdate;
    }

    public void setCdate(String cdate) {
        this.cdate = cdate;
    }

    public String getCip() {
        return cip;
    }

    public void setCip(String cip) {
        this.cip = cip;
    }

    public Integer getCnid() {
        return cnid;
    }

    public void setCnid(Integer cnid) {
        this.cnid = cnid;
    }

    @Override
    public String toString() {
        return "Comment{" +
        ", cid=" + cid +
        ", cauthor=" + cauthor +
        ", ccontent=" + ccontent +
        ", cdate=" + cdate +
        ", cip=" + cip +
        ", cnid=" + cnid +
        "}";
    }
}
