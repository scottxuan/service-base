package com.service.base.service.impl;

import com.module.base.entity.Airline;
import com.scottxuan.base.page.PageParam;
import com.scottxuan.core.page.EnablePage;
import com.scottxuan.core.base.BaseMapper;
import com.scottxuan.core.base.BaseServiceImpl;
import com.scottxuan.core.page.PageResult;
import com.service.base.mapper.AirlineMapper;
import com.service.base.service.AirlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 航公公司表 服务实现类
 * </p>
 *
 * @author scottxuan
 * @since 2020-07-02
 */
@Service
public class AirlineServiceImpl extends BaseServiceImpl<Airline> implements AirlineService {
    @Autowired
    private AirlineMapper airlineMapper;

    @Override
    protected BaseMapper<Airline> getMapper() {
        return airlineMapper;
    }

    @Override
    @EnablePage
    public PageResult<Airline> findListPage(String query, PageParam param) {
        return PageResult.of(airlineMapper.findByQuery(query,"en-US"));
    }
}
