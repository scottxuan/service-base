package com.service.base.mapper;

import com.module.base.entity.Area;
import com.scottxuan.core.base.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 区域表 Mapper 接口
 * </p>
 *
 * @author scottxuan
 * @since 2020-07-02
 */
@Repository
public interface AreaMapper extends BaseMapper<Area> {

    /**
     * 国家查询
     *
     * @param level
     * @param language
     * @return
     */
    List<Area> findByLevel(@Param("level") Integer level, @Param("language") String language);

    /**
     * 根据parentCode查询
     *
     * @param parentCode
     * @param language
     * @return
     */
    List<Area> findByParent(@Param("parentCode") String parentCode, @Param("language") String language);

    /**
     * 根据code查询
     *
     * @param code
     * @param language
     * @return
     */
    Area findByCode(@Param("code") String code, @Param("language") String language);
}
