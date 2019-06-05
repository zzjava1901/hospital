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
@TableName("sys_inside")
public class SysInside extends Model<SysInside> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "inside_id", type = IdType.AUTO)
    private Integer insideId;
    private String jobname;
    private Integer num;
    private Date datetime;


    public Integer getInsideId() {
        return insideId;
    }

    public void setInsideId(Integer insideId) {
        this.insideId = insideId;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    @Override
    protected Serializable pkVal() {
        return this.insideId;
    }

    @Override
    public String toString() {
        return "SysInside{" +
        "insideId=" + insideId +
        ", jobname=" + jobname +
        ", num=" + num +
        ", datetime=" + datetime +
        "}";
    }
}
