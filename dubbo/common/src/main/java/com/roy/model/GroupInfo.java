package com.roy.model;

import java.io.Serializable;
import java.util.Date;

public class GroupInfo  implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group_info.gid
     *
     * @mbg.generated
     */
    private Long gid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group_info.gname
     *
     * @mbg.generated
     */
    private String gname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group_info.gintroduce
     *
     * @mbg.generated
     */
    private String gintroduce;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group_info.creat_qno
     *
     * @mbg.generated
     */
    private Long creatQno;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group_info.creat_time
     *
     * @mbg.generated
     */
    private Date creatTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group_info.attach
     *
     * @mbg.generated
     */
    private String attach;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group_info.gid
     *
     * @return the value of group_info.gid
     *
     * @mbg.generated
     */
    public Long getGid() {
        return gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group_info.gid
     *
     * @param gid the value for group_info.gid
     *
     * @mbg.generated
     */
    public void setGid(Long gid) {
        this.gid = gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group_info.gname
     *
     * @return the value of group_info.gname
     *
     * @mbg.generated
     */
    public String getGname() {
        return gname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group_info.gname
     *
     * @param gname the value for group_info.gname
     *
     * @mbg.generated
     */
    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group_info.gintroduce
     *
     * @return the value of group_info.gintroduce
     *
     * @mbg.generated
     */
    public String getGintroduce() {
        return gintroduce;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group_info.gintroduce
     *
     * @param gintroduce the value for group_info.gintroduce
     *
     * @mbg.generated
     */
    public void setGintroduce(String gintroduce) {
        this.gintroduce = gintroduce == null ? null : gintroduce.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group_info.creat_qno
     *
     * @return the value of group_info.creat_qno
     *
     * @mbg.generated
     */
    public Long getCreatQno() {
        return creatQno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group_info.creat_qno
     *
     * @param creatQno the value for group_info.creat_qno
     *
     * @mbg.generated
     */
    public void setCreatQno(Long creatQno) {
        this.creatQno = creatQno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group_info.creat_time
     *
     * @return the value of group_info.creat_time
     *
     * @mbg.generated
     */
    public Date getCreatTime() {
        return creatTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group_info.creat_time
     *
     * @param creatTime the value for group_info.creat_time
     *
     * @mbg.generated
     */
    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group_info.attach
     *
     * @return the value of group_info.attach
     *
     * @mbg.generated
     */
    public String getAttach() {
        return attach;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group_info.attach
     *
     * @param attach the value for group_info.attach
     *
     * @mbg.generated
     */
    public void setAttach(String attach) {
        this.attach = attach == null ? null : attach.trim();
    }
}