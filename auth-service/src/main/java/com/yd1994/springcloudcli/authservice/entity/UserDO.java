package com.yd1994.springcloudcli.authservice.entity;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.experimental.Tolerate;

import javax.persistence.*;
import java.io.Serializable;


@Builder
@Accessors(chain = true)
@Data
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "user")
public class UserDO implements Serializable {

    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户名
     */
    @Column(name = "username")
    private String username;

    /**
     * 密码
     */
    @Column(name = "password")
    private String password;

    /**
     * 权限
     */
    @Column(name = "authorities")
    private String authorities;

    /**
     * 是否可用
     */
    @Column(name = "enabled")
    private Boolean enabled;

    /**
     * 是否锁定
     */
    @Column(name = "locked")
    private Boolean locked;

    @Tolerate
    public UserDO() {}
}
