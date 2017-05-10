package cn.zsy.mq.listener;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;

@Service
public class QueueOneLitener implements MessageListener {

    @Override
    public void onMessage(Message message) {
        String json = null;
        try {
            json = new String(message.getBody(), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println("data :" + json);
    }

}
