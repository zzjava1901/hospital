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
@TableName("sys_bianpe")
public class SysBianpe extends Model<SysBianpe> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "bp_id", type = IdType.AUTO)
    private Integer bpId;
    @TableField("bp_name")
    private String bpName;
    @TableField("bp_url")
    private String bpUrl;
    @TableField("t_id")
    private Integer tId;


    public Integer getBpId() {
        return bpId;
    }

    public void setBpId(Integer bpId) {
        this.bpId = bpId;
    }

    public String getBpName() {
        return bpName;
    }

    public void setBpName(String bpName) {
        this.bpName = bpName;
    }

    public String getBpUrl() {
        return bpUrl;
    }

    public void setBpUrl(String bpUrl) {
        this.bpUrl = bpUrl;
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    @Override
    protected Serializable pkVal() {
        return this.bpId;
    }

    @Override
    public String toString() {
        return "SysBianpe{" +
        "bpId=" + bpId +
        ", bpName=" + bpName +
        ", bpUrl=" + bpUrl +
        ", tId=" + tId +
        "}";
    }
}
