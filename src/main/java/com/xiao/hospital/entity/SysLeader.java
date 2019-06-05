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
@TableName("sys_leader")
public class SysLeader extends Model<SysLeader> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "lid", type = IdType.AUTO)
    private Integer lid;
    private String lname;
    private String limg;
    private String linfo;


    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getLimg() {
        return limg;
    }

    public void setLimg(String limg) {
        this.limg = limg;
    }

    public String getLinfo() {
        return linfo;
    }

    public void setLinfo(String linfo) {
        this.linfo = linfo;
    }

    @Override
    protected Serializable pkVal() {
        return this.lid;
    }

    @Override
    public String toString() {
        return "SysLeader{" +
        "lid=" + lid +
        ", lname=" + lname +
        ", limg=" + limg +
        ", linfo=" + linfo +
        "}";
    }
}
