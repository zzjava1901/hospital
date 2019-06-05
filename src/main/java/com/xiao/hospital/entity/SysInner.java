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
@TableName("sys_inner")
public class SysInner extends Model<SysInner> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "inner_id", type = IdType.AUTO)
    private Integer innerId;
    @TableField("inener_info")
    private String inenerInfo;
    private Integer iid;
    @TableField("doctor_id")
    private Integer doctorId;


    public Integer getInnerId() {
        return innerId;
    }

    public void setInnerId(Integer innerId) {
        this.innerId = innerId;
    }

    public String getInenerInfo() {
        return inenerInfo;
    }

    public void setInenerInfo(String inenerInfo) {
        this.inenerInfo = inenerInfo;
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
        return this.innerId;
    }

    @Override
    public String toString() {
        return "SysInner{" +
        "innerId=" + innerId +
        ", inenerInfo=" + inenerInfo +
        ", iid=" + iid +
        ", doctorId=" + doctorId +
        "}";
    }
}
