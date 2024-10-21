package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.Counter;
import com.tencent.wxcloudrun.model.IndexInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface CountersMapper {

  Counter getCounter(@Param("id") Integer id);

  void upsertCount(Counter counter);

  void clearCount(@Param("id") Integer id);

  IndexInfo getIndexInfo(@Param("id") Integer id);
}
