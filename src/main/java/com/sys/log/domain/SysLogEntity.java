package com.sys.log.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "sys_log")
public class SysLogEntity implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 用户名
     */
    @Column(name = "username")
    private String username;

    /**
     * 用户操作
     */
    @Column(name = "`operation`")
    private String operation;

    /**
     * 请求方法
     */
    @Column(name = "`method`")
    private String method;

    /**
     * 请求参数
     */
    @Column(name = "params")
    private String params;

    /**
     * 执行时长(毫秒)
     */
    @Column(name = "`time`")
    private Long time;

    /**
     * IP地址
     */
    @Column(name = "ip")
    private String ip;

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    private Date createDate;

    private static final long serialVersionUID = 1L;
}