package com.service.base.service.impl;

import com.module.base.entity.Airport;
import com.scottxuan.core.base.BaseMapper;
import com.scottxuan.core.base.BaseServiceImpl;
import com.service.base.mapper.AirportMapper;
import com.service.base.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 机场表 服务实现类
 * </p>
 *
 * @author scottxuan
 * @since 2020-07-02
 */
@Service
public class AirportServiceImpl extends BaseServiceImpl<Airport> implements AirportService {
    @Autowired
    private AirportMapper airportMapper;

    @Override
    protected BaseMapper<Airport> getMapper() {
        return airportMapper;
    }
}
