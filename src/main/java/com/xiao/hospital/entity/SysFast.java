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
@TableName("sys_fast")
public class SysFast extends Model<SysFast> {

    private static final long serialVersionUID = 1L;

    @TableId("fast_id")
    private Integer fastId;
    @TableField("fast_info")
    private String fastInfo;
    private Integer iid;
    @TableField("docter_id")
    private Integer docterId;


    public Integer getFastId() {
        return fastId;
    }

    public void setFastId(Integer fastId) {
        this.fastId = fastId;
    }

    public String getFastInfo() {
        return fastInfo;
    }

    public void setFastInfo(String fastInfo) {
        this.fastInfo = fastInfo;
    }

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public Integer getDocterId() {
        return docterId;
    }

    public void setDocterId(Integer docterId) {
        this.docterId = docterId;
    }

    @Override
    protected Serializable pkVal() {
        return this.fastId;
    }

    @Override
    public String toString() {
        return "SysFast{" +
        "fastId=" + fastId +
        ", fastInfo=" + fastInfo +
        ", iid=" + iid +
        ", docterId=" + docterId +
        "}";
    }
}
