package com.stylefeng.guns.rest.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.stylefeng.guns.rest.common.persistence.dao.MtimeUserTMapper;
import com.stylefeng.guns.rest.common.persistence.model.MtimeUserT;
import com.stylefeng.guns.rest.user.UserService;
import com.stylefeng.guns.rest.user.vo.UserVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
@Service(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {
    @Autowired
    MtimeUserTMapper userMapper;

    @Override
    public void register(UserVo user) {
        MtimeUserT mtimeUserT = new MtimeUserT();
        BeanUtils.copyProperties(user,mtimeUserT);
        userMapper.insert(mtimeUserT);
    }

    @Override
    public boolean login(String username,String password) {
        Integer login=userMapper.selectByUsernameAndPassword(username,password);
        return false;
    }
}
