package cn.zsy.controller;

import cn.zsy.entity.LongMarchEntity;
import cn.zsy.service.LongMarchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/longmarch")
public class LongMarchController {

    private static final Logger logger = LoggerFactory.getLogger(LongMarchController.class);

    @Autowired
    private LongMarchService longMarchService;


    @RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    public String testCount() throws Exception {
        int conunt = longMarchService.count();
        logger.info("count: {}", conunt);
        return String.valueOf(conunt);
    }

    @ResponseBody
    @RequestMapping(value = "/query", method = {RequestMethod.GET, RequestMethod.POST})
    public String testQuery() throws Exception {
        LongMarchEntity longMarchEntity = new LongMarchEntity();
        longMarchEntity.setAreaAbb("cs");
        List<LongMarchEntity> longMarchEntityList = longMarchService.query(longMarchEntity);
        StringBuilder stringBuilder = new StringBuilder();
        for (LongMarchEntity longMarchEntity1 : longMarchEntityList) {
            stringBuilder.append(longMarchEntity1.toString()+"\n");
            logger.info("Query: {}", longMarchEntity1.toString());
        }
        return stringBuilder.toString();
    }


    @RequestMapping(value = "/insert", method = {RequestMethod.GET, RequestMethod.POST})
    public String testInsert() throws Exception {
        LongMarchEntity longMarchEntity = new LongMarchEntity();
        longMarchEntity.setUserType(2);
        longMarchEntity.setAreaAbb("cs");
        longMarchEntity.setContent("你会挽着我的衣袖,我会把手揣进裤兜.");
        longMarchEntity.setCreateTime(new Date());
        longMarchEntity.setUserId(10000);
        int id = longMarchService.insertMySQL(longMarchEntity);
//        logger.info("Insert: {}", longMarchEntity.getId());
        return longMarchEntity.toString();
    }


    @RequestMapping(value = "/update/{id}", method = {RequestMethod.GET, RequestMethod.POST})
    public String testUpdate(@PathVariable Integer id) throws Exception {
        LongMarchEntity longMarchEntity = new LongMarchEntity();
        longMarchEntity.setId(id);
        longMarchEntity.setUserType(1);
        longMarchEntity.setAreaAbb("cs");
        longMarchEntity.setContent("你会挽着我的衣袖,我会把手揣进裤兜.");
        longMarchEntity.setCreateTime(new Date());
        longMarchEntity.setUserId(11000);
        longMarchService.update(longMarchEntity);
//        logger.info("update: {}", longMarchEntity.toString());
        return longMarchEntity.toString();
    }


    @RequestMapping(value = "/delete/{id}", method = {RequestMethod.GET, RequestMethod.POST})
    public String testDelete(@PathVariable Long id) throws Exception {
        List<Long> ids = new ArrayList<Long>();
        ids.add(id);
//        logger.info("delete before: {}", longMarchService.count());
        longMarchService.delete(ids);
//        logger.info("delete after: {}", longMarchService.count());
        return "delete";
    }


    @RequestMapping(value = "/querypage", method = {RequestMethod.GET, RequestMethod.POST})
    public String testQueryPage() throws Exception {
        LongMarchEntity longMarchEntity = new LongMarchEntity();
        longMarchEntity.setAreaAbb("cs");
        List<LongMarchEntity> longMarchEntityList = longMarchService.queryPage(longMarchEntity);
        StringBuilder stringBuilder = new StringBuilder();
        for (LongMarchEntity longMarchEntity1 : longMarchEntityList) {
            stringBuilder.append(longMarchEntity1.toString()+"\n");
//            logger.info("QueryPage: {}", longMarchEntity1.toString());
        }
        return stringBuilder.toString();
    }

}
