package cn.zsy.start;

import cn.zsy.bean.IMMessage;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ProducerMain {

    @Autowired
    @Qualifier("amqpTemplate")
    private AmqpTemplate amqpTemplate;

    public void sendDataToCrQueue(Object obj) {
        amqpTemplate.convertAndSend("queue_one_key", obj);
    }

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-mq-Producer.xml");
        applicationContext.start();
        IMMessage imMessage = new IMMessage();
        imMessage.setArea("bj");
        imMessage.setGroupName("永远的第七班");
        imMessage.setGroupId("1000");
        ProducerMain producerMain = new ProducerMain();
        producerMain.sendDataToCrQueue(imMessage);
        System.out.print(" im service Main start.");
        while(true){
            System.in.read();
        }
    }

}
