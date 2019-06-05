package com.xiao.hospital.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Feri
 * @since 2019-06-05
 */
@TableName("sys_class")
public class SysClass extends Model<SysClass> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "cl_id", type = IdType.AUTO)
    private Integer clId;
    @TableField("cl_title")
    private String clTitle;
    @TableField("cl_path")
    private String clPath;
    @TableField("cl_date")
    private Date clDate;
    @TableField("he_id")
    private Integer heId;


    public Integer getClId() {
        return clId;
    }

    public void setClId(Integer clId) {
        this.clId = clId;
    }

    public String getClTitle() {
        return clTitle;
    }

    public void setClTitle(String clTitle) {
        this.clTitle = clTitle;
    }

    public String getClPath() {
        return clPath;
    }

    public void setClPath(String clPath) {
        this.clPath = clPath;
    }

    public Date getClDate() {
        return clDate;
    }

    public void setClDate(Date clDate) {
        this.clDate = clDate;
    }

    public Integer getHeId() {
        return heId;
    }

    public void setHeId(Integer heId) {
        this.heId = heId;
    }

    @Override
    protected Serializable pkVal() {
        return this.clId;
    }

    @Override
    public String toString() {
        return "SysClass{" +
        "clId=" + clId +
        ", clTitle=" + clTitle +
        ", clPath=" + clPath +
        ", clDate=" + clDate +
        ", heId=" + heId +
        "}";
    }
}
