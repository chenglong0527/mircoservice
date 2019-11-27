package com.stylefeng.guns.rest.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.stylefeng.guns.rest.common.persistence.dao.MtimeFilmTMapper;
import com.stylefeng.guns.rest.common.persistence.model.MtimeFilmT;
import com.stylefeng.guns.rest.film.FilmService;
import com.stylefeng.guns.rest.film.vo.FilmVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: jia.xue
 * @create: 2019-11-27 11:40
 * @Description
 **/
@Component
@Service(interfaceClass = FilmService.class)
public class FilmServiceImpl implements FilmService {

    @Autowired
    private MtimeFilmTMapper mtimeFilmTMapper;


    @Override
    public FilmVO getById(Integer id) {

        MtimeFilmT mtimeFilmT = mtimeFilmTMapper.selectById(id);
        FilmVO filmVO = convert2FilmVO(mtimeFilmT);
        return filmVO;
    }

    private FilmVO convert2FilmVO(MtimeFilmT mtimeFilmT) {
        FilmVO filmVO = new FilmVO();
        if (mtimeFilmT == null) {
            return filmVO;
        }
//        filmVO.setUuid(mtimeFilmT.getUuid());
//        filmVO.setFilmName(mtimeFilmT.getFilmName());
//
        BeanUtils.copyProperties(mtimeFilmT,filmVO);

        return filmVO;
    }
}
