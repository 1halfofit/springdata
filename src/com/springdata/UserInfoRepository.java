package com.springdata;

import org.springframework.data.repository.CrudRepository;


public interface UserInfoRepository extends CrudRepository<UserInfo,Integer> {
    UserInfo findByOrdersId(Integer id);
}
