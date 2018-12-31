package com.yd1994.springcloudcli.userservice.repository;

import com.yd1994.springcloudcli.userservice.entity.UserInfoDO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * UserInfoDO 持久化类
 *
 * @author yd
 */
public interface UserInfoDORepository extends JpaRepository<UserInfoDO, Long> {

    /**
     * 通过id获取
     * @param id
     * @return
     */
    Optional<UserInfoDO> getFirstById(Long id);

    /**
     * 通过name获取
     * @param name
     * @return
     */
    Optional<UserInfoDO> getFirstByName(String name);

}
