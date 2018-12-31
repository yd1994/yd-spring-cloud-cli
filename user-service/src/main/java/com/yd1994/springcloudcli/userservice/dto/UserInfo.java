package com.yd1994.springcloudcli.userservice.dto;

import com.yd1994.springcloudcli.userservice.entity.UserInfoDO;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Optional;

/**
 * 用户信息 dto
 * @author yd
 */
@Accessors(chain = true)
@Data
@ToString
@EqualsAndHashCode
public class UserInfo implements Serializable {

    static final long serialVersionUID = 9655L;

    /**
     * 昵称
     */
    private String name;

    public UserInfo() {
    }

    /**
     * 通过 userInfoDO 创建
     * @param userInfoDO
     */
    public UserInfo(UserInfoDO userInfoDO) {
        Optional<UserInfoDO> o = Optional.ofNullable(userInfoDO);
        if (o.isPresent()) {
            this.setName(userInfoDO.getName());
        }
    }

    /**
     * 转换为 UserInfoDO
     * @return 包含该实例参数 name 的值的 UserInfoDO 实例
     */
    public UserInfoDO toUserInfoDO() {
        return UserInfoDO.builder()
                .name(this.name)
                .build();
    }
}
