package com.patterncat.model;


import lombok.Getter;
import lombok.Setter;

/**
 * Created by piguanghua on 2016/12/23.
 */
@Getter
@Setter
public class Message {
    private Long id;
    private Long senderId;
    private String sender;  //消息发送者id，若为系统消息则为0
    private String content;
    private Integer type; //1:系统消息  2:订阅（关注）消息
    private Integer status; // 1:可用 0:不可用
    private Long createTime;
    private Long updateTime;

    public Message(Long id, Long senderId, String sender, String content, Integer type, Integer status, Long createTime, Long updateTime) {
        this.id = id;
        this.senderId = senderId;
        this.sender = sender;
        this.content = content;
        this.type = type;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Message() {
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", senderId=" + senderId +
                ", sender='" + sender + '\'' +
                ", content='" + content + '\'' +
                ", type=" + type +
                ", status=" + status +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
