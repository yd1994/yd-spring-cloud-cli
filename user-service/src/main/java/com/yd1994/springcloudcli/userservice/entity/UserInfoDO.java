package com.yd1994.springcloudcli.userservice.entity;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.experimental.Tolerate;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 用户信息
 * spring data jpa 类
 *
 * @author yd
 */
@Builder
@Accessors(chain = true)
@Data
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "user_info")
public class UserInfoDO implements Serializable {

    @Tolerate
    public UserInfoDO() {}

    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户昵称
     */
    @Column(name = "name")
    private String name;

}
