package com.study.it.entity;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
/**
 * <p>
 * 
 * </p>
 *
 * @author CQW
 * @since 2022-05-29
 */
public class StudentTest2 implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String department;

    private String classes;

    private String sid;

    @TableField("useTime")
    private String usetime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getUsetime() {
        return usetime;
    }

    public void setUsetime(String usetime) {
        this.usetime = usetime;
    }

    @Override
    public String toString() {
        return "StudentTest2{" +
        ", name=" + name +
        ", department=" + department +
        ", classes=" + classes +
        ", sid=" + sid +
        ", usetime=" + usetime +
        "}";
    }
}
