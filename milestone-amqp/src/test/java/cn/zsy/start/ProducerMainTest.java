package cn.zsy.start;

import cn.zsy.bean.IMMessage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mq-Producer.xml")
public class ProducerMainTest {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Test
    public void sendDataToCrQueue() throws Exception {
        IMMessage imMessage = new IMMessage();
        imMessage.setArea("bj");
        imMessage.setGroupName("永远的第七班");
        imMessage.setGroupId("1000");
        ProducerMain producerMain = new ProducerMain();
        producerMain.sendDataToCrQueue(imMessage);
//        amqpTemplate.convertAndSend("queue_one_key", imMessage);
        System.out.print(" im service Main start.");
    }

}