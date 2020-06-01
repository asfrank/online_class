package net.xdclass.online_xdclass.service;

import net.xdclass.online_xdclass.domain.User;

import java.util.Map;

public interface UserService {

    // 新增用户
    int save(Map<String, String> userInfo);

}
