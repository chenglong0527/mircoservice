package com.stylefeng.guns.rest.user;

import com.stylefeng.guns.rest.user.vo.UserVo;

public interface UserService {
    public void register(UserVo user);
    public boolean login(String username,String password);
}
