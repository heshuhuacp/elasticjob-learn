package com.elasticjob.demo;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyJob implements SimpleJob {

    private static final Logger logger = LoggerFactory.getLogger(MyJob.class);

    public void execute(ShardingContext shardingContext) {

        switch (shardingContext.getShardingItem()){
            case 0:
                //分片序列号,参数
                logger.info("执行MyJob,{},{}", new Object[]{shardingContext.getShardingItem(),shardingContext.getShardingParameter()});
                break;
            case 1:
                logger.info("执行MyJob,{},{}", new Object[]{shardingContext.getShardingItem(),shardingContext.getShardingParameter()});
                break;
            case 2:
                logger.info("执行MyJob,{},{}", new Object[]{shardingContext.getShardingItem(),shardingContext.getShardingParameter()});
                break;

        }

    }
}
