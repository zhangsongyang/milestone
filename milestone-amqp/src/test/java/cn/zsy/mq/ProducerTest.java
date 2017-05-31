package cn.zsy.mq;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:spring-mq-Producer.xml")
//public class ProducerTest {
//
//    @Autowired
//    private Producer producer;
//
//    @Test
//    public void sendDataToCrQueue() throws Exception {
//        IMMessage imMessage = new IMMessage();
//        imMessage.setArea("bj");
//        imMessage.setGroupName("永远的第七班");
//        imMessage.setGroupId("1000");
//        for (int i = 0; i < 100000; i++) {
//            producer.sendDataToCrQueue(imMessage);
//            System.out.println(imMessage.toString());
//        }
//        System.out.print(" im service Main start.");
//    }
//
//}