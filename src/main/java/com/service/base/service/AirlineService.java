package com.service.base.service;

import com.module.base.entity.Airline;
import com.scottxuan.base.page.PageParam;
import com.scottxuan.core.base.BaseService;
import com.scottxuan.core.page.PageResult;

import java.util.List;

/**
 * <p>
 * 航公公司表 服务类
 * </p>
 *
 * @author scottxuan
 * @since 2020-07-02
 */
public interface AirlineService extends BaseService<Airline> {

    /**
     * 分页查询
     * @param query
     * @param param
     * @return
     */
    PageResult<Airline> findListPage(String query, PageParam param);
}
