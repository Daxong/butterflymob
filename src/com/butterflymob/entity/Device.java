package com.butterflymob.entity;

public class Device {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device.deviceId
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    private Integer deviceid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device.resolution
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    private String resolution;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device.OS
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    private String os;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device.ConnectWay
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    private String connectway;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device.carrier
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    private String carrier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device.shareCount
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    private Integer sharecount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device.deviceId
     *
     * @return the value of device.deviceId
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    public Integer getDeviceid() {
        return deviceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device.deviceId
     *
     * @param deviceid the value for device.deviceId
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    public void setDeviceid(Integer deviceid) {
        this.deviceid = deviceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device.resolution
     *
     * @return the value of device.resolution
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device.resolution
     *
     * @param resolution the value for device.resolution
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    public void setResolution(String resolution) {
        this.resolution = resolution == null ? null : resolution.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device.OS
     *
     * @return the value of device.OS
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    public String getOs() {
        return os;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device.OS
     *
     * @param os the value for device.OS
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    public void setOs(String os) {
        this.os = os == null ? null : os.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device.ConnectWay
     *
     * @return the value of device.ConnectWay
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    public String getConnectway() {
        return connectway;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device.ConnectWay
     *
     * @param connectway the value for device.ConnectWay
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    public void setConnectway(String connectway) {
        this.connectway = connectway == null ? null : connectway.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device.carrier
     *
     * @return the value of device.carrier
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device.carrier
     *
     * @param carrier the value for device.carrier
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    public void setCarrier(String carrier) {
        this.carrier = carrier == null ? null : carrier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device.shareCount
     *
     * @return the value of device.shareCount
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    public Integer getSharecount() {
        return sharecount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device.shareCount
     *
     * @param sharecount the value for device.shareCount
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    public void setSharecount(Integer sharecount) {
        this.sharecount = sharecount;
    }
}