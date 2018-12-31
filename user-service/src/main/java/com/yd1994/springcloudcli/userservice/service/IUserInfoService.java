package com.yd1994.springcloudcli.userservice.service;

import com.yd1994.springcloudcli.userservice.dto.UserInfo;

/**
 * UserInfo service 类
 *
 * @author yd
 */
public interface IUserInfoService {

    /**
     * 通过id获取UserInfo
     * @param id
     * @return
     */
    public UserInfo getUserInfoById(Long id) throws Exception;

    public UserInfo getUserInfoByName(String name) throws Exception;

}
