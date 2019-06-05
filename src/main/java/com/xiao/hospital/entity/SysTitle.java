package com.xiao.hospital.entity;

import com.baomidou.mybatisplus.enums.IdType;
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
@TableName("sys_title")
public class SysTitle extends Model<SysTitle> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "title_id", type = IdType.AUTO)
    private Integer titleId;
    @TableField("title_fu_id")
    private Integer titleFuId;
    @TableField("title_name")
    private String titleName;
    @TableField("title_url")
    private String titleUrl;
    @TableField("title_flag")
    private Integer titleFlag;


    public Integer getTitleId() {
        return titleId;
    }

    public void setTitleId(Integer titleId) {
        this.titleId = titleId;
    }

    public Integer getTitleFuId() {
        return titleFuId;
    }

    public void setTitleFuId(Integer titleFuId) {
        this.titleFuId = titleFuId;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public String getTitleUrl() {
        return titleUrl;
    }

    public void setTitleUrl(String titleUrl) {
        this.titleUrl = titleUrl;
    }

    public Integer getTitleFlag() {
        return titleFlag;
    }

    public void setTitleFlag(Integer titleFlag) {
        this.titleFlag = titleFlag;
    }

    @Override
    protected Serializable pkVal() {
        return this.titleId;
    }

    @Override
    public String toString() {
        return "SysTitle{" +
        "titleId=" + titleId +
        ", titleFuId=" + titleFuId +
        ", titleName=" + titleName +
        ", titleUrl=" + titleUrl +
        ", titleFlag=" + titleFlag +
        "}";
    }
}
