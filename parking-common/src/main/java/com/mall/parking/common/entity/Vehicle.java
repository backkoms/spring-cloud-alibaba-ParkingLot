package com.mall.parking.common.entity;

import java.util.Date;

public class Vehicle {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vehicle.id
     *
     * @mbg.generated Tue Dec 31 11:32:22 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vehicle.member_id
     *
     * @mbg.generated Tue Dec 31 11:32:22 CST 2019
     */
    private String memberId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vehicle.plate_no
     *
     * @mbg.generated Tue Dec 31 11:32:22 CST 2019
     */
    private String plateNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vehicle.vehicle_inf
     *
     * @mbg.generated Tue Dec 31 11:32:22 CST 2019
     */
    private String vehicleInf;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vehicle.create_by
     *
     * @mbg.generated Tue Dec 31 11:32:22 CST 2019
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vehicle.create_date
     *
     * @mbg.generated Tue Dec 31 11:32:22 CST 2019
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vehicle.update_by
     *
     * @mbg.generated Tue Dec 31 11:32:22 CST 2019
     */
    private String updateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vehicle.update_date
     *
     * @mbg.generated Tue Dec 31 11:32:22 CST 2019
     */
    private Date updateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vehicle.remark
     *
     * @mbg.generated Tue Dec 31 11:32:22 CST 2019
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vehicle.version
     *
     * @mbg.generated Tue Dec 31 11:32:22 CST 2019
     */
    private Integer version;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vehicle.state
     *
     * @mbg.generated Tue Dec 31 11:32:22 CST 2019
     */
    private Integer state;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vehicle.id
     *
     * @return the value of vehicle.id
     *
     * @mbg.generated Tue Dec 31 11:32:22 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vehicle.id
     *
     * @param id the value for vehicle.id
     *
     * @mbg.generated Tue Dec 31 11:32:22 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vehicle.member_id
     *
     * @return the value of vehicle.member_id
     *
     * @mbg.generated Tue Dec 31 11:32:22 CST 2019
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vehicle.member_id
     *
     * @param memberId the value for vehicle.member_id
     *
     * @mbg.generated Tue Dec 31 11:32:22 CST 2019
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vehicle.plate_no
     *
     * @return the value of vehicle.plate_no
     *
     * @mbg.generated Tue Dec 31 11:32:22 CST 2019
     */
    public String getPlateNo() {
        return plateNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vehicle.plate_no
     *
     * @param plateNo the value for vehicle.plate_no
     *
     * @mbg.generated Tue Dec 31 11:32:22 CST 2019
     */
    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo == null ? null : plateNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vehicle.vehicle_inf
     *
     * @return the value of vehicle.vehicle_inf
     *
     * @mbg.generated Tue Dec 31 11:32:22 CST 2019
     */
    public String getVehicleInf() {
        return vehicleInf;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vehicle.vehicle_inf
     *
     * @param vehicleInf the value for vehicle.vehicle_inf
     *
     * @mbg.generated Tue Dec 31 11:32:22 CST 2019
     */
    public void setVehicleInf(String vehicleInf) {
        this.vehicleInf = vehicleInf == null ? null : vehicleInf.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vehicle.create_by
     *
     * @return the value of vehicle.create_by
     *
     * @mbg.generated Tue Dec 31 11:32:22 CST 2019
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vehicle.create_by
     *
     * @param createBy the value for vehicle.create_by
     *
     * @mbg.generated Tue Dec 31 11:32:22 CST 2019
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vehicle.create_date
     *
     * @return the value of vehicle.create_date
     *
     * @mbg.generated Tue Dec 31 11:32:22 CST 2019
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vehicle.create_date
     *
     * @param createDate the value for vehicle.create_date
     *
     * @mbg.generated Tue Dec 31 11:32:22 CST 2019
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vehicle.update_by
     *
     * @return the value of vehicle.update_by
     *
     * @mbg.generated Tue Dec 31 11:32:22 CST 2019
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vehicle.update_by
     *
     * @param updateBy the value for vehicle.update_by
     *
     * @mbg.generated Tue Dec 31 11:32:22 CST 2019
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vehicle.update_date
     *
     * @return the value of vehicle.update_date
     *
     * @mbg.generated Tue Dec 31 11:32:22 CST 2019
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vehicle.update_date
     *
     * @param updateDate the value for vehicle.update_date
     *
     * @mbg.generated Tue Dec 31 11:32:22 CST 2019
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vehicle.remark
     *
     * @return the value of vehicle.remark
     *
     * @mbg.generated Tue Dec 31 11:32:22 CST 2019
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vehicle.remark
     *
     * @param remark the value for vehicle.remark
     *
     * @mbg.generated Tue Dec 31 11:32:22 CST 2019
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vehicle.version
     *
     * @return the value of vehicle.version
     *
     * @mbg.generated Tue Dec 31 11:32:22 CST 2019
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vehicle.version
     *
     * @param version the value for vehicle.version
     *
     * @mbg.generated Tue Dec 31 11:32:22 CST 2019
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vehicle.state
     *
     * @return the value of vehicle.state
     *
     * @mbg.generated Tue Dec 31 11:32:22 CST 2019
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vehicle.state
     *
     * @param state the value for vehicle.state
     *
     * @mbg.generated Tue Dec 31 11:32:22 CST 2019
     */
    public void setState(Integer state) {
        this.state = state;
    }
}