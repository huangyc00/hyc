package com.hyc.msg.eitity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "msg_msg")
@Data
public class Msg {

    /**
     * 服务的内容
     */

    public enum Type{
        EMIAL,SMS,WEIXIN
    }
    /**
     * 主键
     */
    @Id
    @Column(name = "UUID" , nullable = false)
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @GeneratedValue(generator = "system-uuid")
    private String uuid ;

    /**
     * 服务名称
     */
    @Column(name = "NAME",nullable = false,length = 50)
    private String name ;

    /**
     * 是否使用
     */
    @Column(name = "IS_USE",nullable = false)
    private Boolean isUse = false;

    /**
     * 发送人
     */
    @Column(name = "SENDER",nullable = false)
    private String sender ;

    /**
     * 接收人
     */
    @Column(name = "RECEIVER",nullable = false)
    private String receiver ;

    /**
     * 发送消息的内容
     */
    @Column(name = "CONTENT",length = 1000)
    private String content ;

    /**
     * 发送的时间
     */
    @Column(name = "SEND_TIME",nullable = false)
    private Timestamp sendTime;

    /**
     * 服务类型
     */
    @Column(name = "TYPE",nullable = false)
    private Msg.Type type;

}
