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
@TableName("sys_health")
public class SysHealth extends Model<SysHealth> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "he_id", type = IdType.AUTO)
    private Integer heId;
    @TableField("he_name")
    private String heName;
    @TableField("he_url")
    private String heUrl;
    @TableField("t_id")
    private Integer tId;


    public Integer getHeId() {
        return heId;
    }

    public void setHeId(Integer heId) {
        this.heId = heId;
    }

    public String getHeName() {
        return heName;
    }

    public void setHeName(String heName) {
        this.heName = heName;
    }

    public String getHeUrl() {
        return heUrl;
    }

    public void setHeUrl(String heUrl) {
        this.heUrl = heUrl;
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    @Override
    protected Serializable pkVal() {
        return this.heId;
    }

    @Override
    public String toString() {
        return "SysHealth{" +
        "heId=" + heId +
        ", heName=" + heName +
        ", heUrl=" + heUrl +
        ", tId=" + tId +
        "}";
    }
}
