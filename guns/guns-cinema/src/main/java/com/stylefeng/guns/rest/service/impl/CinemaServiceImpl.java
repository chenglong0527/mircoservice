package com.stylefeng.guns.rest.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.stylefeng.guns.rest.modular.cinema.CinemaService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 影片主表 服务实现类
 * </p>
 *
 * @author ciggar
 * @since 2019-11-27
 */
@Component
@Service(interfaceClass = CinemaService.class)
public class CinemaServiceImpl implements CinemaService {
    @Override
    public void say() {
        System.out.println("你好");
    }
}
