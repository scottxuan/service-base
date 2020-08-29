package com.service.base.api;

import com.module.base.api.AirlineApi;
import com.module.base.entity.Airline;
import com.scottxuan.base.page.PageParam;
import com.scottxuan.web.base.BaseController;
import com.scottxuan.web.result.ResultDto;
import com.service.base.service.AirlineService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 航公公司表 前端控制器
 * </p>
 *
 * @author scottxuan
 * @since 2020-07-02
 */
@Api(tags = "20000--航司管理")
@RestController
@RequestMapping(AirlineApi.MAPPING)
public class AirlineController extends BaseController implements AirlineApi {
    @Autowired
    private AirlineService airlineService;

    @Override
    public ResultDto<List<Airline>> findListPage(String query, int pageIndex, int pageSize, String sort, boolean asc) {
        PageParam param = new PageParam(pageIndex, pageSize, sort, asc);
        return getResultDto(airlineService.findListPage(query,param));
    }
}
