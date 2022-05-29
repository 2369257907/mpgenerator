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
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;

    private String 姓名;

    private String 性别;

    private Integer 年龄;

    public String get姓名() {
        return 姓名;
    }

    public void set姓名(String 姓名) {
        this.姓名 = 姓名;
    }

    public String get性别() {
        return 性别;
    }

    public void set性别(String 性别) {
        this.性别 = 性别;
    }

    public Integer get年龄() {
        return 年龄;
    }

    public void set年龄(Integer 年龄) {
        this.年龄 = 年龄;
    }

    @Override
    public String toString() {
        return "Teacher{" +
        ", 姓名=" + 姓名 +
        ", 性别=" + 性别 +
        ", 年龄=" + 年龄 +
        "}";
    }
}
