package com.service.base.api;

import com.scottxuan.web.base.BaseController;
import com.service.base.service.AirportService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 机场表 前端控制器
 * </p>
 *
 * @author scottxuan
 * @since 2020-07-02
 */
@Api(tags = "机场表")
@RestController
@RequestMapping("${api}/airport")
public class AirportController extends BaseController {
    @Autowired
    private AirportService airportService;

}
