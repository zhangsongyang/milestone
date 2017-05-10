package cn.zsy.mq.listener;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mq-Consumer.xml")
public class QueueOneLitenerTest {

    @Test
    public void onMessage() throws Exception {
        while (true){

        }
    }

}