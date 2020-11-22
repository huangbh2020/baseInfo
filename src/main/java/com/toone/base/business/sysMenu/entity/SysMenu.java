package com.toone.base.business.sysMenu.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 菜单
 * </p>
 *
 * @author huanghb
 * @since 2020-11-19
 */
@TableName("sys_menu")
public class SysMenu implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 菜单编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 菜单名称
     */
    @TableField("menu_name")
    private String menuName;

    /**
     * 菜单类型(0：目录1：菜单2：按钮)
     */
    @TableField("menu_type")
    private Integer menuType;

    /**
     * 上级菜单编号
     */
    @TableField("parent_id")
    private Long parentId;

    /**
     * 节点图标CSS类名
     */
    @TableField("iconcls_")
    private String iconcls;

    /**
     * 请求地址
     */
    @TableField("request_")
    private String request;

    /**
     * 展开状态(1:展开;0:收缩)
     */
    @TableField("expand")
    private Boolean expand;

    /**
     * 排序号
     */
    @TableField("sort_no")
    private Integer sortNo;

    /**
     * 叶子节点(0:树枝节点;1:叶子节点)
     */
    @TableField("is_show")
    private Boolean isShow;

    /**
     * 权限标识
     */
    @TableField("permission_")
    private String permission;

    /**
     * 备注
     */
    @TableField("remark")
    private String remark;

    /**
     * 是否删除
     */
    @TableField("is_del")
    private Boolean isDel;

    /**
     * 是否启用
     */
    @TableField("enable")
    private Boolean enable;

    @TableField("create_by")
    private Long createBy;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("update_by")
    private Long updateBy;

    @TableField("update_time")
    private LocalDateTime updateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Integer getMenuType() {
        return menuType;
    }

    public void setMenuType(Integer menuType) {
        this.menuType = menuType;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getIconcls() {
        return iconcls;
    }

    public void setIconcls(String iconcls) {
        this.iconcls = iconcls;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public Boolean getExpand() {
        return expand;
    }

    public void setExpand(Boolean expand) {
        this.expand = expand;
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    public Boolean getShow() {
        return isShow;
    }

    public void setShow(Boolean isShow) {
        this.isShow = isShow;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "SysMenu{" +
        "id=" + id +
        ", menuName=" + menuName +
        ", menuType=" + menuType +
        ", parentId=" + parentId +
        ", iconcls=" + iconcls +
        ", request=" + request +
        ", expand=" + expand +
        ", sortNo=" + sortNo +
        ", isShow=" + isShow +
        ", permission=" + permission +
        ", remark=" + remark +
        ", isDel=" + isDel +
        ", enable=" + enable +
        ", createBy=" + createBy +
        ", createTime=" + createTime +
        ", updateBy=" + updateBy +
        ", updateTime=" + updateTime +
        "}";
    }
}
