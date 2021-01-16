package tech.guyi.component.message.stream.api.entry;

import lombok.Data;

/**
 * 消息实体
 * @author guyi
 * @date 2021/1/15 22:53
 */
@Data
public class Message {

    /**
     * 地址 <br />
     * 当为发送消息时, 此字段表示要发送的地址 <br />
     * 当为接收消息时, 此字段表示来源地址 <br />
     * 此字段是否生效, 有消息流实现决定
     */
    private String address;

    /**
     * 消息流名称集合 <br />
     * 当为接收消息时, 此值表示来源的消息流 <br />
     * 当为发送消息时, 此值表示要发送的消息流 <br />
     * 当为发送消息是, 此值为空表示发送到所有消息流
     */
    private String stream;
    /**
     * 消息主题
     */
    private String topic;
    /**
     * 消息内容
     */
    private byte[] content;

}
