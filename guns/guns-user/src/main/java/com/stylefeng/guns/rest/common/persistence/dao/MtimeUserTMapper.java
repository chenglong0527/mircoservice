package com.stylefeng.guns.rest.common.persistence.dao;

import com.stylefeng.guns.rest.common.persistence.model.MtimeUserT;
import com.baomidou.mybatisplus.mapper.BaseMapper;import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author ciggar
 * @since 2019-11-27
 */
public interface MtimeUserTMapper extends BaseMapper<MtimeUserT> {

    Integer selectByUsernameAndPassword(@Param("username")String username, @Param("password")String password);
}
