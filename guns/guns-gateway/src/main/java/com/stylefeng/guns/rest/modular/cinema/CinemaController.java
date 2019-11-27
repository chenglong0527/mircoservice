package com.stylefeng.guns.rest.modular.cinema;

import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.rest.RespMessage;
import com.stylefeng.guns.rest.film.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CinemaController {
    @Reference(interfaceClass = CinemaService.class,check = false)
    CinemaService cinemaService;
    @RequestMapping("aaaaa")
    public RespMessage say(){
        cinemaService.say();
        return RespMessage.ok();
    }
}
