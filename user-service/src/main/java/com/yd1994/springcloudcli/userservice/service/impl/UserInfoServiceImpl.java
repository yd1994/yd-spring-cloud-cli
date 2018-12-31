package com.yd1994.springcloudcli.userservice.service.impl;

import com.yd1994.springcloudcli.userservice.dto.UserInfo;
import com.yd1994.springcloudcli.userservice.entity.UserInfoDO;
import com.yd1994.springcloudcli.userservice.exception.ResourceNotFoundException;
import com.yd1994.springcloudcli.userservice.repository.UserInfoDORepository;
import com.yd1994.springcloudcli.userservice.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements IUserInfoService {

    @Autowired
    private UserInfoDORepository userInfoDORepository;

    @Override
    public UserInfo getUserInfoById(Long id) throws Exception {
        UserInfoDO userInfoDO = this.userInfoDORepository.getFirstById(id)
                .orElseThrow(() -> new ResourceNotFoundException());
        return new UserInfo(userInfoDO);
    }

    @Override
    public UserInfo getUserInfoByName(String name) throws Exception {
        UserInfoDO userInfoDO = this.userInfoDORepository.getFirstByName(name)
                .orElseThrow(() -> new ResourceNotFoundException());
        return new UserInfo(userInfoDO);
    }
}
