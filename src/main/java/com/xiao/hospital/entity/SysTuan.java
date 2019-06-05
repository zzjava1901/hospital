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
@TableName("sys_tuan")
public class SysTuan extends Model<SysTuan> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "tuan_id", type = IdType.AUTO)
    private Integer tuanId;
    private String ttitle;
    private String tpath;
    private Date tdate;


    public Integer getTuanId() {
        return tuanId;
    }

    public void setTuanId(Integer tuanId) {
        this.tuanId = tuanId;
    }

    public String getTtitle() {
        return ttitle;
    }

    public void setTtitle(String ttitle) {
        this.ttitle = ttitle;
    }

    public String getTpath() {
        return tpath;
    }

    public void setTpath(String tpath) {
        this.tpath = tpath;
    }

    public Date getTdate() {
        return tdate;
    }

    public void setTdate(Date tdate) {
        this.tdate = tdate;
    }

    @Override
    protected Serializable pkVal() {
        return this.tuanId;
    }

    @Override
    public String toString() {
        return "SysTuan{" +
        "tuanId=" + tuanId +
        ", ttitle=" + ttitle +
        ", tpath=" + tpath +
        ", tdate=" + tdate +
        "}";
    }
}
