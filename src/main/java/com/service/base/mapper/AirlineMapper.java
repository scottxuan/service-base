package com.service.base.mapper;

import com.module.base.entity.Airline;
import com.scottxuan.core.base.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 航公公司表 Mapper 接口
 * </p>
 *
 * @author scottxuan
 * @since 2020-07-02
 */
@Repository
public interface AirlineMapper extends BaseMapper<Airline> {

    /**
     * 关键字查询
     * @param query
     * @param language
     * @return
     */
    List<Airline> findByQuery(@Param("query") String query, @Param("language") String language);
}
