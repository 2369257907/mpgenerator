package com.study.it.entity;
import java.time.LocalDate;
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
public class Stu3 implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer age;

    @TableField("Score")
    private String score;

    private LocalDate birthday;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Stu3{" +
        ", age=" + age +
        ", score=" + score +
        ", birthday=" + birthday +
        "}";
    }
}
