package com.butterflymob.entity;

import java.util.Date;

public class Comment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.usrId
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    private Integer usrid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.content
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.time
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    private Date time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.isVisual
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    private Integer isvisual;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.usrId
     *
     * @return the value of comment.usrId
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    public Integer getUsrid() {
        return usrid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.usrId
     *
     * @param usrid the value for comment.usrId
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    public void setUsrid(Integer usrid) {
        this.usrid = usrid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.content
     *
     * @return the value of comment.content
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.content
     *
     * @param content the value for comment.content
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.time
     *
     * @return the value of comment.time
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.time
     *
     * @param time the value for comment.time
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.isVisual
     *
     * @return the value of comment.isVisual
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    public Integer getIsvisual() {
        return isvisual;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.isVisual
     *
     * @param isvisual the value for comment.isVisual
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    public void setIsvisual(Integer isvisual) {
        this.isvisual = isvisual;
    }
}