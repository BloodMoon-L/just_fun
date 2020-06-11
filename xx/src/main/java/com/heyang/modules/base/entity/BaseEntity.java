package com.heyang.modules.base.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import org.apache.ibatis.type.JdbcType;

import java.io.Serializable;
import java.util.Date;

/**
 * Copyright (c) 2018 by [安徽航天信息]
 *
 * @ClassName: BaseEntity
 * @Description: 基础字段
 * @Author: wangjiajia
 * @CreateDate: 2019-10-19 21:20
 * @LastUpdateAutor: wangjiajia
 * @LastUpdateDate: 2019-10-19 21:20
 */
@Data
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 创建人
     */
    @TableField(value = "create_person_id", fill = FieldFill.INSERT, jdbcType = JdbcType.VARCHAR)
    private String createPersonId;

    /**
     * 创建时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "create_date", fill = FieldFill.INSERT, jdbcType = JdbcType.TIMESTAMP)
    private Date createDate;

    /**
     * 更新人
     */
    @TableField(value = "modify_person_id", fill = FieldFill.INSERT_UPDATE, jdbcType = JdbcType.VARCHAR)
    private String modifyPersonId;

    /**
     * 更新时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "modify_date", fill = FieldFill.INSERT_UPDATE, jdbcType = JdbcType.TIMESTAMP)
    private Date modifyDate;


    /**
     * 页面多条件查询参数
     */
    @TableField(exist = false)
    private String queryParams;

}
