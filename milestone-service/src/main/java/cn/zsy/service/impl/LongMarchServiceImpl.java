package cn.zsy.service.impl;


import cn.zsy.entity.LongMarchEntity;
import cn.zsy.repository.LongMarchRepository;
import cn.zsy.repository.impl.LongMarchRepositoryImpl;
import cn.zsy.service.LongMarchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LongMarchServiceImpl implements LongMarchService {

    @Autowired
    LongMarchRepository longMarchRepository;

    private static final Logger logger = LoggerFactory.getLogger(LongMarchRepositoryImpl.class);

    @Override
    public int count() throws Exception {
        LongMarchEntity longMarchEntity = new LongMarchEntity();
        return longMarchRepository.count(longMarchEntity);
    }

    @Override
    public List<LongMarchEntity> query(LongMarchEntity longMarchEntity) throws Exception {
        List<LongMarchEntity> longMarchEntityList = longMarchRepository.query(longMarchEntity);
        return longMarchEntityList;
    }

    @Override
    public List<LongMarchEntity> queryPage(LongMarchEntity longMarchEntity) throws Exception {
        return longMarchRepository.queryPage(longMarchEntity);
    }

    @Override
    public int insert(LongMarchEntity longMarchEntity) throws Exception {
        return longMarchRepository.insert(longMarchEntity);
    }

    @Override
    public int insertMySQL(LongMarchEntity longMarchEntity) throws Exception {
        return longMarchRepository.insertMySQL(longMarchEntity);
    }

    @Override
    public void update(LongMarchEntity longMarchEntity) throws Exception {
        longMarchRepository.update(longMarchEntity);
    }

    @Override
    public void delete(List<Long> ids) throws Exception {
        longMarchRepository.delete(ids);
    }
}
