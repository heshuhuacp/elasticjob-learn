package com.elasticjob.mapper;

import com.elasticjob.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

    User getUserById(@Param("userId") String userId);

    List<User> getUserByProvince(@Param("province") String province);
}
