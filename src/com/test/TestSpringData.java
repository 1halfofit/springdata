package com.test;

import com.springdata.UserInfo;
import com.springdata.UserInfoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class TestSpringData {
private ApplicationContext context =null;
private UserInfoRepository userInfoRepository  =null;
    {
        context= new ClassPathXmlApplicationContext("applicationContext.xml");
        userInfoRepository = context.getBean(UserInfoRepository.class);
    }
    @Test
    public void Test(){
        List<UserInfo> list = new ArrayList<>();
        for (int i=0;i<10;i++){
            UserInfo userInfo = new UserInfo();
            userInfo.setName("ÕÅÈý"+i);
            userInfo.setBirth(new Date());
        list.add(userInfo);
        }
//        userInfoRepository.delete(20);
//        userInfoRepository.save(list);
//        List<UserInfo> all = (List<UserInfo>) userInfoRepository.findAll(Arrays.asList(12, 13, 14, 16));
//        System.out.println(all);
    }
    @Test
    public void Test2(){
    }

}

