package com.stylefeng.guns.rest.modular.user;
import java.util.Date;

import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.rest.RespMessage;
import com.stylefeng.guns.rest.film.FilmService;
import com.stylefeng.guns.rest.user.UserService;
import com.stylefeng.guns.rest.user.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: jia.xue
 * @create: 2019-11-27 10:18
 * @Description
 **/
@RestController
public class UserController {


    @Reference(interfaceClass = UserService.class)
    UserService userService;
    @RequestMapping("user/register")
    public RespMessage register(String username,String password,
                        String mobile,String email,
                        String address){
        UserVo userVo = new UserVo();
        userVo.setUserName(username);
        userVo.setUserPwd(password);
        userVo.setNickName("");
        userVo.setUserSex(0);
        userVo.setBirthday("");
        userVo.setEmail(email);
        userVo.setUserPhone(mobile);
        userVo.setAddress(address);
        userVo.setHeadUrl("");
        userVo.setBiography("");
        userVo.setLifeState(0);
        userVo.setBeginTime(new Date());
        userVo.setUpdateTime(new Date());
        userService.register(userVo);

        return RespMessage.ok();
    }
}
