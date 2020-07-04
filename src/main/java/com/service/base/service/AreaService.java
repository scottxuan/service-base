package com.service.base.service;

import com.module.base.entity.Area;
import com.scottxuan.base.page.PageParam;
import com.scottxuan.base.page.QueryParam;
import com.scottxuan.base.result.ResultBo;
import com.scottxuan.core.base.BaseService;
import com.scottxuan.core.page.PageResult;

import java.util.List;

/**
 * <p>
 * 区域表 服务类
 * </p>
 *
 * @author scottxuan
 * @since 2020-07-02
 */
public interface AreaService extends BaseService<Area> {

    /**
     * 国家查询(分页)
     * @param param
     * @return
     */
    PageResult<Area> country(PageParam param);

    /**
     * 国家查询
     * @return
     */
    List<Area> country();

    /**
     * 根据父级code分页查询
     * @param parentCode
     * @param param
     * @return
     */
    PageResult<Area> findByParent(String parentCode, PageParam param);

    /**
     * 根据父级code查询
     * @param parentCode
     * @return
     */
    List<Area> findByParent(String parentCode);

    /**
     * 根据code查询
     * @param code
     * @return
     */
    ResultBo<Area> findByCode(String code);

}
