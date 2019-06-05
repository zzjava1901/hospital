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
@TableName("sys_society")
public class SysSociety extends Model<SysSociety> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "society_id", type = IdType.AUTO)
    private Integer societyId;
    private String jobname;
    private Integer num;
    private Date datetime;


    public Integer getSocietyId() {
        return societyId;
    }

    public void setSocietyId(Integer societyId) {
        this.societyId = societyId;
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
        return this.societyId;
    }

    @Override
    public String toString() {
        return "SysSociety{" +
        "societyId=" + societyId +
        ", jobname=" + jobname +
        ", num=" + num +
        ", datetime=" + datetime +
        "}";
    }
}
