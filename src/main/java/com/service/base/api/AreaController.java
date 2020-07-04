package com.service.base.api;

import com.module.base.api.AreaApi;
import com.module.base.entity.Area;
import com.scottxuan.base.page.PageParam;
import com.scottxuan.web.base.BaseController;
import com.scottxuan.web.result.ResultDto;
import com.service.base.service.AreaService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 区域表 前端控制器
 * </p>
 *
 * @author scottxuan
 * @since 2020-07-02
 */
@Api(tags = "10000--区域管理")
@RestController
public class AreaController extends BaseController implements AreaApi {
    @Autowired
    private AreaService areaService;

    @Override
    public ResultDto<List<Area>> country(Integer pageIndex, Integer pageSize, String sort, Boolean asc) {
        PageParam param = new PageParam(pageIndex, pageSize, sort, asc);
        return getResultDto(areaService.country(param));
    }

    @Override
    public ResultDto<List<Area>> country() {
        return getResultDto(areaService.country());
    }

    @Override
    public ResultDto<List<Area>> findByParent(String parentCode, Integer pageIndex, Integer pageSize, String sort, Boolean asc) {
        PageParam param = new PageParam(pageIndex, pageSize, sort, asc);
        return getResultDto(areaService.findByParent(parentCode,param));
    }

    @Override
    public ResultDto<List<Area>> findByParent(String parentCode) {
        return getResultDto(areaService.findByParent(parentCode));
    }

    @Override
    public ResultDto<Area> findByCode(String code) {
        return getResultDto(areaService.findByCode(code));
    }
}
