package tech.guyi.component.message.stream.websocket.executor;

/**
 * Websocket连接地址处理器 <br />
 * 用于替换替换表达式的值
 * @author guyi
 * @date 2021/1/19 11:29
 */
public interface WebSocketServerExecutor {

    /**
     * 替换表达式 <br />
     * 此方法返回的值会将表达式占位替换 (包括{}) <br />
     * 返回空表示不支持此表达式的替换 <br />
     * 当有多个处理器都返回了非空值时, 将随机取值, 所以并不建议存在多个处理器
     * @param ex 表达式, 即被{}包裹的内容
     * @return 被替换的值
     */
    String execute(String ex);

}
