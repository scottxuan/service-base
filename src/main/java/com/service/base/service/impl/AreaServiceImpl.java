package com.service.base.service.impl;

import com.google.common.collect.Lists;
import com.module.base.entity.Area;
import com.scottxuan.base.page.PageParam;
import com.scottxuan.base.result.ResultBo;
import com.scottxuan.core.page.EnablePage;
import com.scottxuan.core.base.BaseMapper;
import com.scottxuan.core.base.BaseServiceImpl;
import com.scottxuan.core.page.PageResult;
import com.service.base.mapper.AreaMapper;
import com.service.base.service.AreaService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 区域表 服务实现类
 * </p>
 *
 * @author scottxuan
 * @since 2020-07-02
 */
@Service
public class AreaServiceImpl extends BaseServiceImpl<Area> implements AreaService {
    @Autowired
    private AreaMapper areaMapper;

    @Override
    protected BaseMapper<Area> getMapper() {
        return areaMapper;
    }

    @Override
    @EnablePage
    public PageResult<Area> country(PageParam param) {
        return PageResult.of(areaMapper.findByLevel(1,"en-US"));
    }

    @Override
    public List<Area> country() {
        return areaMapper.findByLevel(1,"en-US");
    }

    @Override
    @EnablePage
    public PageResult<Area> findByParent(String parentCode, PageParam param) {
        if (StringUtils.isBlank(parentCode)) {
            return PageResult.empty();
        }
        return PageResult.of(areaMapper.findByParent(parentCode,"en-US"));
    }

    @Override
    public List<Area> findByParent(String parentCode) {
        if (StringUtils.isBlank(parentCode)) {
            return Lists.newArrayList();
        }
        return areaMapper.findByParent(parentCode,"en-US");
    }

    @Override
    public ResultBo<Area> findByCode(String code) {
        if (StringUtils.isBlank(code)) {
            return ResultBo.empty();
        }
        return ResultBo.of(areaMapper.findByCode(code,"en-US"));
    }
}
