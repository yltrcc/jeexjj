/****************************************************
 * Description: Entity for 角色
 * Copyright:   Copyright (c) 2021
 * Company:     xjj
 * @author      zhanghejie
 * @version     1.0
 * @see
	HISTORY
    *  2021-05-06 zhanghejie Create File
**************************************************/

package com.xjj.business.test.entity;

import com.xjj.framework.entity.EntitySupport;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TestEntity extends EntitySupport {

    private static final long serialVersionUID = 1L;
    public TestEntity(){}
    private String title;//名称
    private String code;//编码
    private String description;//描述
    private String status;//状态
    /**
     * 返回名称
     * @return 名称
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * 设置名称
     * @param title 名称
     */
    public void setTitle(String title) {
        this.title = title;
    }
    
    /**
     * 返回编码
     * @return 编码
     */
    public String getCode() {
        return code;
    }
    
    /**
     * 设置编码
     * @param code 编码
     */
    public void setCode(String code) {
        this.code = code;
    }
    
    /**
     * 返回描述
     * @return 描述
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * 设置描述
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * 返回状态
     * @return 状态
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * 设置状态
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status;
    }
    

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SIMPLE_STYLE).append("com.xjj.module.test.entity.TestEntity").append("ID="+this.getId()).toString();
    }
}

