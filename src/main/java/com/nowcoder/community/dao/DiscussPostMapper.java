package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
// Mapper 和表格一一对应 同理和service也是一一对应
// DiscussPostMapper主要是处理
public interface DiscussPostMapper {

    // userId 动态sql
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    // 获取总共有多少个帖子，userId 动态sql
    int selectDiscussPostRows(@Param("userId") int userId);
    // Param 用于参数别名，但只有一个参数时，并且在<if>里面使用，必须添加这个注解

    int insertDiscussPost(DiscussPost discussPost);

    DiscussPost selectDiscussPostById(int id);

}
