package cn.zsy.repository.impl;

import cn.zsy.entity.LongMarchEntity;
import cn.zsy.mapper.LongMarchMapper;
import cn.zsy.repository.LongMarchRepository;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LongMarchRepositoryImpl implements LongMarchRepository {

    @Autowired
    private LongMarchMapper longMarchMapper;

    private static final Logger logger = LoggerFactory.getLogger(LongMarchRepositoryImpl.class);


    @Override
    public int count(LongMarchEntity longMarchEntity) throws Exception {
        logger.info(longMarchEntity.toString());
        return longMarchMapper.count(longMarchEntity);
    }

    @Override
    public List<LongMarchEntity> query(LongMarchEntity longMarchEntity) throws Exception {
        return longMarchMapper.query(longMarchEntity);
    }

    @Override
    public List<LongMarchEntity> queryPage(LongMarchEntity longMarchEntity) throws Exception {
        //获取第1页，10条内容，默认查询总数count
//        PageHelper.startPage(1, 10);
        PageHelper.startPage(2, 2);

        //紧跟着的第一个select方法会被分页
        List<LongMarchEntity> list = longMarchMapper.query(longMarchEntity);
        //用PageInfo对结果进行包装
        PageInfo page = new PageInfo(list);
        return page.getList();
    }

    @Override
    public int insert(LongMarchEntity longMarchEntity) throws Exception {
        return longMarchMapper.insert(longMarchEntity);
    }

    @Override
    public int insertMySQL(LongMarchEntity longMarchEntity) throws Exception {
        return longMarchMapper.insertMysql(longMarchEntity);
    }

    @Override
    public void update(LongMarchEntity longMarchEntity) throws Exception {
        longMarchMapper.update(longMarchEntity);
    }

    @Override
    public void delete(List<Long> ids) throws Exception {
        longMarchMapper.delete(ids);
    }

}
