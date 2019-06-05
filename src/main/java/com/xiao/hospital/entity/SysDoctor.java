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
@TableName("sys_doctor")
public class SysDoctor extends Model<SysDoctor> {

    private static final long serialVersionUID = 1L;

    @TableId("doc_id")
    private Integer docId;
    @TableField("doc_name")
    private String docName;
    @TableField("doc_info")
    private String docInfo;
    @TableField("doc_img")
    private String docImg;


    public Integer getDocId() {
        return docId;
    }

    public void setDocId(Integer docId) {
        this.docId = docId;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDocInfo() {
        return docInfo;
    }

    public void setDocInfo(String docInfo) {
        this.docInfo = docInfo;
    }

    public String getDocImg() {
        return docImg;
    }

    public void setDocImg(String docImg) {
        this.docImg = docImg;
    }

    @Override
    protected Serializable pkVal() {
        return this.docId;
    }

    @Override
    public String toString() {
        return "SysDoctor{" +
        "docId=" + docId +
        ", docName=" + docName +
        ", docInfo=" + docInfo +
        ", docImg=" + docImg +
        "}";
    }
}
