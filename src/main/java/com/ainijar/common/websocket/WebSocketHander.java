package com.ainijar.common.websocket;

import org.slf4j.LoggerFactory;
import org.springframework.web.socket.*;

import java.io.IOException;
import java.util.ArrayList;

/**
 * @author slt
 * @date 2018/8/29
 */
public class WebSocketHander implements WebSocketHandler {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(WebSocketHander.class);

    private static final ArrayList<WebSocketSession> users = new ArrayList<WebSocketSession>();

    private String userName = "";

    /**
     * 初次链接成功执行
     *
     * @param session
     * @throws Exception
     */
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        logger.debug("链接成功......");
        users.add(session);
        userName = (String) session.getAttributes().get("WEBSOCKET_USERNAME");
        System.out.println("第一次连接获取的id--" + userName);
        if (userName != null) {
            // 查询未读消息
            int count = 5;
            session.sendMessage(new TextMessage(count + ""));
        }
    }

    /**
     * 接受消息处理消息
     *
     * @param webSocketSession
     * @param webSocketMessage
     * @throws Exception
     */
    @Override
    public void handleMessage(WebSocketSession webSocketSession, WebSocketMessage<?> webSocketMessage)
            throws Exception {
        //sendMessageToUsers(new TextMessage(webSocketMessage.getPayload() + ""));
        sendMessageToUser(userName, new TextMessage(webSocketMessage.getPayload() + ""));

    }

    @Override
    public void handleTransportError(WebSocketSession webSocketSession, Throwable throwable) throws Exception {
        if (webSocketSession.isOpen()) {
            webSocketSession.close();
        }
        logger.debug("链接出错，关闭链接......");
        users.remove(webSocketSession);
    }

    @Override
    public void afterConnectionClosed(WebSocketSession webSocketSession, CloseStatus closeStatus) throws Exception {
        logger.debug("链接关闭......" + closeStatus.toString());
        users.remove(webSocketSession);
    }

    @Override
    public boolean supportsPartialMessages() {
        return false;
    }

    /**
     * 给所有在线用户发送消息
     *
     * @param message
     */
    public void sendMessageToUsers(TextMessage message) {
        for (WebSocketSession user : users) {
            System.out.println(user.getAttributes().get("WEBSOCKET_USERNAME"));
            try {
                if (user.isOpen()) {
                    user.sendMessage(message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 给某个用户发送消息，模拟给admin发信息
     *
     * @param userName
     * @param message
     */
    public void sendMessageToUser(String userName, TextMessage message) {
        for (WebSocketSession user : users) {
            System.out.println("从session里面获取的id" + user.getAttributes().get("WEBSOCKET_USERNAME"));
            if (user.getAttributes().get("WEBSOCKET_USERNAME").equals("admin")) {
                try {
                    if (user.isOpen()) {
                        user.sendMessage(message);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }
}
