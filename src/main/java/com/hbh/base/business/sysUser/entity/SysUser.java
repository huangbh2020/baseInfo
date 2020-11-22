package com.hbh.base.business.sysUser.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 用户管理
 * </p>
 *
 * @author huanghb
 * @since 2020-11-22
 */
@TableName("sys_user")
public class SysUser implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 登陆帐户
     */
    @TableField("account")
    private String account;

    /**
     * 密码
     */
    @TableField("password")
    private String password;

    /**
     * 用户类型(1普通用户2管理员3系统用户)
     */
    @TableField("user_type")
    private String userType;

    /**
     * 姓名
     */
    @TableField("user_name")
    private String userName;

    /**
     * 姓名拼音
     */
    @TableField("name_pinyin")
    private String namePinyin;

    /**
     * 性别(0:未知;1:男;2:女)
     */
    @TableField("sex")
    private Integer sex;

    /**
     * 头像
     */
    @TableField("avatar")
    private String avatar;

    /**
     * 电话
     */
    @TableField("phone")
    private String phone;

    /**
     * 邮箱
     */
    @TableField("email")
    private String email;

    /**
     * 身份证号码
     */
    @TableField("id_card")
    private String idCard;

    /**
     * 出生日期
     */
    @TableField("birth_day")
    private LocalDate birthDay;

    /**
     * 部门编号
     */
    @TableField("dept_id")
    private Long deptId;

    /**
     * 职位
     */
    @TableField("position")
    private String position;

    /**
     * 详细地址
     */
    @TableField("address")
    private String address;

    /**
     * 工号
     */
    @TableField("staff_no")
    private String staffNo;

    /**
     * 是否删除
     */
    @TableField("is_del")
    private Boolean isDel;

    @TableField("enable")
    private Boolean enable;

    @TableField("remark")
    private String remark;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("create_by")
    private Long createBy;

    @TableField("update_time")
    private LocalDateTime updateTime;

    @TableField("update_by")
    private Long updateBy;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNamePinyin() {
        return namePinyin;
    }

    public void setNamePinyin(String namePinyin) {
        this.namePinyin = namePinyin;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(String staffNo) {
        this.staffNo = staffNo;
    }

    public Boolean getDel() {
        return isDel;
    }

    public void setDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    @Override
    public String toString() {
        return "SysUser{" +
        "id=" + id +
        ", account=" + account +
        ", password=" + password +
        ", userType=" + userType +
        ", userName=" + userName +
        ", namePinyin=" + namePinyin +
        ", sex=" + sex +
        ", avatar=" + avatar +
        ", phone=" + phone +
        ", email=" + email +
        ", idCard=" + idCard +
        ", birthDay=" + birthDay +
        ", deptId=" + deptId +
        ", position=" + position +
        ", address=" + address +
        ", staffNo=" + staffNo +
        ", isDel=" + isDel +
        ", enable=" + enable +
        ", remark=" + remark +
        ", createTime=" + createTime +
        ", createBy=" + createBy +
        ", updateTime=" + updateTime +
        ", updateBy=" + updateBy +
        "}";
    }
}
