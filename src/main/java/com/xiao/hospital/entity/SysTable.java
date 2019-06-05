package com.xiao.hospital.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
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
@TableName("sys_table")
public class SysTable extends Model<SysTable> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "table_id", type = IdType.AUTO)
    private Integer tableId;
    @TableField("table_path")
    private String tablePath;
    private Date datetime;


    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public String getTablePath() {
        return tablePath;
    }

    public void setTablePath(String tablePath) {
        this.tablePath = tablePath;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    @Override
    protected Serializable pkVal() {
        return this.tableId;
    }

    @Override
    public String toString() {
        return "SysTable{" +
        "tableId=" + tableId +
        ", tablePath=" + tablePath +
        ", datetime=" + datetime +
        "}";
    }
}
