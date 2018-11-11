package com.elasticjob.demo;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.dataflow.DataflowJob;
import com.elasticjob.mapper.UserMapper;
import com.elasticjob.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Dataflow类型job
 */
public class MyDataFlowJob implements DataflowJob<User> {

    private static final Logger logger = LoggerFactory.getLogger(MyDataFlowJob.class);

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> fetchData(ShardingContext shardingContext) {

        logger.info("fetchData province={}",new Object[]{shardingContext.getShardingParameter()});
        List<User> list =  userMapper.getUserByProvince(shardingContext.getShardingParameter());
        return list;

    }

    @Override
    public void processData(ShardingContext shardingContext, List<User> list) {

        logger.info("来自{}的用户有{}个", new Object[]{shardingContext.getShardingParameter(), list.size()});
    }


}
