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
public class HibernateSequence implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long nextVal;

    public Long getNextVal() {
        return nextVal;
    }

    public void setNextVal(Long nextVal) {
        this.nextVal = nextVal;
    }

    @Override
    public String toString() {
        return "HibernateSequence{" +
        ", nextVal=" + nextVal +
        "}";
    }
}
