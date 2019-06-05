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
@TableName("sys_ninfo")
public class SysNinfo extends Model<SysNinfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ni_id", type = IdType.AUTO)
    private Integer niId;
    @TableField("ni_title")
    private String niTitle;
    @TableField("ni_text")
    private String niText;
    @TableField("ni_date")
    private Date niDate;


    public Integer getNiId() {
        return niId;
    }

    public void setNiId(Integer niId) {
        this.niId = niId;
    }

    public String getNiTitle() {
        return niTitle;
    }

    public void setNiTitle(String niTitle) {
        this.niTitle = niTitle;
    }

    public String getNiText() {
        return niText;
    }

    public void setNiText(String niText) {
        this.niText = niText;
    }

    public Date getNiDate() {
        return niDate;
    }

    public void setNiDate(Date niDate) {
        this.niDate = niDate;
    }

    @Override
    protected Serializable pkVal() {
        return this.niId;
    }

    @Override
    public String toString() {
        return "SysNinfo{" +
        "niId=" + niId +
        ", niTitle=" + niTitle +
        ", niText=" + niText +
        ", niDate=" + niDate +
        "}";
    }
}
