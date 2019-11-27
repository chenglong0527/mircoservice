package com.stylefeng.guns.rest.modular.film;

import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.rest.film.FilmService;
import com.stylefeng.guns.rest.film.vo.FilmVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: jia.xue
 * @create: 2019-11-27 11:54
 * @Description
 **/
@RestController
@RequestMapping(value = "film")
public class FilmController {

    @Reference(interfaceClass = FilmService.class)
    private FilmService filmService;


    @RequestMapping(value = "query")
    public FilmVO queryById(Integer id){
        FilmVO vo = filmService.getById(id);
        return vo;
    }
}
