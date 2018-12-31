package com.yd1994.springcloudcli.demoservice.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 用户信息 dto
 *
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

}
