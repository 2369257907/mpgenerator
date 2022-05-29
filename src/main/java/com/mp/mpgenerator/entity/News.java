package com.mp.mpgenerator.entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
/**
 * <p>
 * 
 * </p>
 *
 * @author 
 * @since 2022-05-29
 */
public class News implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "nid", type = IdType.AUTO)
    private Integer nid;

    private Integer ntid;

    private String ntitle;

    private String nauthor;

    private LocalDateTime ncreatedate;

    private String npicpath;

    private String ncontent;

    private LocalDateTime nmodifydate;

    private String nsummary;

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public Integer getNtid() {
        return ntid;
    }

    public void setNtid(Integer ntid) {
        this.ntid = ntid;
    }

    public String getNtitle() {
        return ntitle;
    }

    public void setNtitle(String ntitle) {
        this.ntitle = ntitle;
    }

    public String getNauthor() {
        return nauthor;
    }

    public void setNauthor(String nauthor) {
        this.nauthor = nauthor;
    }

    public LocalDateTime getNcreatedate() {
        return ncreatedate;
    }

    public void setNcreatedate(LocalDateTime ncreatedate) {
        this.ncreatedate = ncreatedate;
    }

    public String getNpicpath() {
        return npicpath;
    }

    public void setNpicpath(String npicpath) {
        this.npicpath = npicpath;
    }

    public String getNcontent() {
        return ncontent;
    }

    public void setNcontent(String ncontent) {
        this.ncontent = ncontent;
    }

    public LocalDateTime getNmodifydate() {
        return nmodifydate;
    }

    public void setNmodifydate(LocalDateTime nmodifydate) {
        this.nmodifydate = nmodifydate;
    }

    public String getNsummary() {
        return nsummary;
    }

    public void setNsummary(String nsummary) {
        this.nsummary = nsummary;
    }

    @Override
    public String toString() {
        return "News{" +
        ", nid=" + nid +
        ", ntid=" + ntid +
        ", ntitle=" + ntitle +
        ", nauthor=" + nauthor +
        ", ncreatedate=" + ncreatedate +
        ", npicpath=" + npicpath +
        ", ncontent=" + ncontent +
        ", nmodifydate=" + nmodifydate +
        ", nsummary=" + nsummary +
        "}";
    }
}
