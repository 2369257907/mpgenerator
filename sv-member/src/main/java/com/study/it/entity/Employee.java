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
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer age;

    private String name;

    private String title;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Employee{" +
        ", id=" + id +
        ", age=" + age +
        ", name=" + name +
        ", title=" + title +
        "}";
    }
}
