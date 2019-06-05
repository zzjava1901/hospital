package com.xiao.hospital.entity;

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
@TableName("sys_out")
public class SysOut extends Model<SysOut> {

    private static final long serialVersionUID = 1L;

    @TableId("out_id")
    private Integer outId;
    @TableField("out_info")
    private String outInfo;
    private Integer iid;
    @TableField("doctor_id")
    private Integer doctorId;


    public Integer getOutId() {
        return outId;
    }

    public void setOutId(Integer outId) {
        this.outId = outId;
    }

    public String getOutInfo() {
        return outInfo;
    }

    public void setOutInfo(String outInfo) {
        this.outInfo = outInfo;
    }

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    @Override
    protected Serializable pkVal() {
        return this.outId;
    }

    @Override
    public String toString() {
        return "SysOut{" +
        "outId=" + outId +
        ", outInfo=" + outInfo +
        ", iid=" + iid +
        ", doctorId=" + doctorId +
        "}";
    }
}
