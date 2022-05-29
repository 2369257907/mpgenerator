package com.study.it.entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
/**
 * <p>
 * 留言表
 * </p>
 *
 * @author CQW
 * @since 2022-05-29
 */
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 内容
     */
    private String content;

    /**
     * 评论人
     */
    private String username;

    /**
     * 评论时间
     */
    private String time;

    /**
     * 父ID
     */
    private Long parentId;

    /**
     * 关联id
     */
    private Long foreignId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getForeignId() {
        return foreignId;
    }

    public void setForeignId(Long foreignId) {
        this.foreignId = foreignId;
    }

    @Override
    public String toString() {
        return "Message{" +
        ", id=" + id +
        ", content=" + content +
        ", username=" + username +
        ", time=" + time +
        ", parentId=" + parentId +
        ", foreignId=" + foreignId +
        "}";
    }
}
