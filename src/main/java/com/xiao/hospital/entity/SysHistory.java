package com.xiao.hospital.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
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
@TableName("sys_history")
public class SysHistory extends Model<SysHistory> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "hid", type = IdType.AUTO)
    private Integer hid;
    private String htitle;
    private String hpath;
    private Date hdate;


    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public String getHtitle() {
        return htitle;
    }

    public void setHtitle(String htitle) {
        this.htitle = htitle;
    }

    public String getHpath() {
        return hpath;
    }

    public void setHpath(String hpath) {
        this.hpath = hpath;
    }

    public Date getHdate() {
        return hdate;
    }

    public void setHdate(Date hdate) {
        this.hdate = hdate;
    }

    @Override
    protected Serializable pkVal() {
        return this.hid;
    }

    @Override
    public String toString() {
        return "SysHistory{" +
        "hid=" + hid +
        ", htitle=" + htitle +
        ", hpath=" + hpath +
        ", hdate=" + hdate +
        "}";
    }
}
