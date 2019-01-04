package com.yd1994.springcloudcli.authservice.repository;

import com.yd1994.springcloudcli.authservice.entity.UserDO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDORepository extends JpaRepository<UserDO, Long> {

    /**
     * 通过username获取
     * @param username 用户名
     * @return
     */
    Optional<UserDO> findByUsername(String username);

}
