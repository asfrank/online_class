package net.xdclass.online_xdclass.service;

import java.util.Map;

public interface UserService {

    // 新增用户
    int save(Map<String, String> userInfo);

    String findByPhoneAndPwd(String phone, String pwd);
}
