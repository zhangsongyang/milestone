package cn.zsy.repository.impl;

import cn.zsy.entity.LongMarchEntity;
import cn.zsy.repository.LongMarchRepository;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-db.xml")
public class LongMarchRepositoryImplTest {

    @Autowired
    LongMarchRepository longMarchRepository;

    @Test
    public void count() throws Exception {
        LongMarchEntity longMarchEntity = new LongMarchEntity();
        longMarchEntity.setUserType(2);
        int count = longMarchRepository.count(longMarchEntity);
        TestCase.assertEquals(5, count);
    }

    @Test
    public void query() throws Exception {
        LongMarchEntity longMarchEntity = new LongMarchEntity();
        List<LongMarchEntity> longMarchEntityList = longMarchRepository.query(longMarchEntity);
        TestCase.assertEquals(6, longMarchEntityList.size());
    }

    @Test
    public void queryPage() throws Exception {
        LongMarchEntity longMarchEntity = new LongMarchEntity();
        List<LongMarchEntity> longMarchEntityList = longMarchRepository.queryPage(longMarchEntity);
        TestCase.assertEquals(2, longMarchEntityList.size());
    }

    @Test
    public void insert() throws Exception {

    }

    @Test
    public void insertMySQL() throws Exception {
        LongMarchEntity longMarchEntity = new LongMarchEntity();
        longMarchEntity.setUserType(2);
        longMarchEntity.setUserId(1234567);
        longMarchEntity.setAreaAbb("sx");
        longMarchEntity.setContent("你会挽着我的衣袖,我会把手揣进裤兜.");
        longMarchEntity.setCreateTime(new Date());
        longMarchRepository.insertMySQL(longMarchEntity);
        System.out.println(longMarchEntity.getId());
    }

    @Test
    public void update() throws Exception {
        LongMarchEntity longMarchEntity = new LongMarchEntity();
        longMarchEntity.setId(8);
        longMarchEntity.setUserType(2);
        longMarchEntity.setUserId(7654321);
        longMarchEntity.setAreaAbb("sx");
        longMarchEntity.setContent("你会挽着我的衣袖,我会把手揣进裤兜.");
        longMarchEntity.setCreateTime(new Date());
        longMarchRepository.update(longMarchEntity);
    }

    @Test
    public void delete() throws Exception {
        List<Long> ids = new ArrayList<Long>();
        ids.add(9L);
        longMarchRepository.delete(ids);
    }

}