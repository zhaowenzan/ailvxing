package com.itrip.biz.service.impl;

import com.itrip.beans.pojo.User;
import com.itrip.biz.service.UserService;
import com.itrip.dao.user.UserMapper;
import com.itrip.utils.PagedData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceimpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public PagedData<User> getPageData(int pageIndex, int pageSize) {
        int from=(pageIndex-1)*pageSize;
        List<User> list = userMapper.getUser(from, pageSize);
        int con = userMapper.getUserCount();
        PagedData<User>pagedata=new PagedData<>(pageIndex,pageSize,con,list);
        return pagedata;
    }
}
