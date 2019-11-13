package com.itrip.biz.service.impl;

import com.itrip.beans.pojo.Linkuser;
import com.itrip.biz.service.LinkuserService;
import com.itrip.dao.Linkuser.LinkuserMapper;
import com.itrip.utils.PagedData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LinkuserServiceimpl implements LinkuserService {

    @Resource
    LinkuserMapper linkuserMapper;


    @Override
    public PagedData<Linkuser> getPageData(String linkUserName, int pageIndex, int pageSize) {
        int from=(pageIndex-1)*pageSize;
        List<Linkuser> list = linkuserMapper.getLinkuserBylinkUserName(linkUserName, from, pageSize);
        int con = linkuserMapper.getLinkuserBylinkUserNameCount(linkUserName);
        PagedData<Linkuser>getData=new PagedData<>(pageIndex,pageSize,con,list);
        return getData;
    }
}
