package com.zichen.bootstrap.base;

import java.sql.Date;

/**
 * 实体类   表结构
 * @author 				紫宸
 * @Param id			序号
 * @Param function		功能
 * @Param Solution		解决方式
 * @Param SampleCode	示例代码

 * @Method get()/set()/toString()
 */
public class Note {
    private Integer id;

    private Date createDate;

    private Date modifyDate;

    private String function;

    private String solution;

    private String sampleCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function == null ? null : function.trim();
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution == null ? null : solution.trim();
    }

    public String getSampleCode() {
        return sampleCode;
    }

    public void setSampleCode(String sampleCode) {
        this.sampleCode = sampleCode == null ? null : sampleCode.trim();
    }
}