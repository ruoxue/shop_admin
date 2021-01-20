package com.ruoyi.task.domain;

import java.io.Serializable;

public class Msg  implements Serializable {

    private  Long sendTime;
    private  Long delayedTime;
    private  String  content;
    private int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Long getSendTime() {
        return sendTime;
    }

    public void setSendTime(Long sendTime) {
        this.sendTime = sendTime;
    }

    public Long getDelayedTime() {
        return delayedTime;
    }

    public void setDelayedTime(Long delayedTime) {
        this.delayedTime = delayedTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "sendTime=" + sendTime +
                ", delayedTime=" + delayedTime +
                ", content='" + content + '\'' +
                '}';
    }
}
