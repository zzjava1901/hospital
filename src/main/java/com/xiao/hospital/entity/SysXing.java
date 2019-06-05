package com.xiao.hospital.entity;

import com.baomidou.mybatisplus.enums.IdType;
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
@TableName("sys_xing")
public class SysXing extends Model<SysXing> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "xid", type = IdType.AUTO)
    private Integer xid;
    private String xname;
    private Integer tid;


    public Integer getXid() {
        return xid;
    }

    public void setXid(Integer xid) {
        this.xid = xid;
    }

    public String getXname() {
        return xname;
    }

    public void setXname(String xname) {
        this.xname = xname;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    @Override
    protected Serializable pkVal() {
        return this.xid;
    }

    @Override
    public String toString() {
        return "SysXing{" +
        "xid=" + xid +
        ", xname=" + xname +
        ", tid=" + tid +
        "}";
    }
}
