package com.iflytek.cachemanager.entity;

import java.io.Serializable;

public class Dictionary001 implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dictionary001.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dictionary001.pid
     *
     * @mbg.generated
     */
    private Integer pid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dictionary001.level
     *
     * @mbg.generated
     */
    private Integer level;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dictionary001.state
     *
     * @mbg.generated
     */
    private Integer state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dictionary001.descmsg
     *
     * @mbg.generated
     */
    private String descmsg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dictionary001.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dictionary001
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dictionary001.id
     *
     * @return the value of dictionary001.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dictionary001.id
     *
     * @param id the value for dictionary001.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dictionary001.pid
     *
     * @return the value of dictionary001.pid
     *
     * @mbg.generated
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dictionary001.pid
     *
     * @param pid the value for dictionary001.pid
     *
     * @mbg.generated
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dictionary001.level
     *
     * @return the value of dictionary001.level
     *
     * @mbg.generated
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dictionary001.level
     *
     * @param level the value for dictionary001.level
     *
     * @mbg.generated
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dictionary001.state
     *
     * @return the value of dictionary001.state
     *
     * @mbg.generated
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dictionary001.state
     *
     * @param state the value for dictionary001.state
     *
     * @mbg.generated
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dictionary001.descmsg
     *
     * @return the value of dictionary001.descmsg
     *
     * @mbg.generated
     */
    public String getDescmsg() {
        return descmsg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dictionary001.descmsg
     *
     * @param descmsg the value for dictionary001.descmsg
     *
     * @mbg.generated
     */
    public void setDescmsg(String descmsg) {
        this.descmsg = descmsg == null ? null : descmsg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dictionary001.content
     *
     * @return the value of dictionary001.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dictionary001.content
     *
     * @param content the value for dictionary001.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}