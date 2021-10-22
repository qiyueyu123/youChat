package com.qiyueyu.youchat.enums;

/**
 * 动作类型枚举类
 */
public enum  MsgActionEnum {

    CONNECT(1, "初始换连接"),
    CHAT_MSG(2, "聊天信息"),
    SIGNED_MSG(3, "聊天信息签收"),
    PULL_FRIEND(4, "拉取好友");

    private final Integer type;
    private final String content;

    MsgActionEnum(Integer type, String content) {
        this.type = type;
        this.content = content;
    }

    public Integer getType() {
        return type;
    }
}