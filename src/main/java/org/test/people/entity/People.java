package org.test.people.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Administrator
 */
public class People implements Serializable {

    private static final long serialVersionUID = -8588140626045461689L;
    private Integer id;
    private String name;
    private Integer age;
    private String msg;
    private Integer inserter;
    private Date insertTime;
    private Integer updater;
    private Date  updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getInserter() {
        return inserter;
    }

    public void setInserter(Integer inserter) {
        this.inserter = inserter;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Integer getUpdater() {
        return updater;
    }

    public void setUpdater(Integer updater) {
        this.updater = updater;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", msg='" + msg + '\'' +
                ", inserter=" + inserter +
                ", insertTime=" + insertTime +
                ", updater=" + updater +
                ", updateTime=" + updateTime +
                '}';
    }
}
