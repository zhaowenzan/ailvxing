package com.itrip.biz.controller;

import com.itrip.beans.dto.Dto;
import com.itrip.beans.pojo.Linkuser;
import com.itrip.biz.service.LinkuserService;
import com.itrip.utils.DtoUtil;
import com.itrip.utils.PagedData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api")
public class LinkuserController {

    @Resource
    LinkuserService linkuserService;


    @RequestMapping("/Linkuser/queryLinkuserByname")
    public Dto getPageLinkuserByname(@RequestParam(value = "linkUserName",required = false) String linkUserName,
                                     @RequestParam(value = "pageIndex",defaultValue = "1") int pageIndex){
        int pageSize=5;
        PagedData<Linkuser> pageData = linkuserService.getPageData(linkUserName, pageIndex, pageSize);
        if(pageData.getList().size()>0){
            return DtoUtil.returnSuccess(pageData,"found data of hotel");
        }else{
            return DtoUtil.returnFail("no data found");
        }
    }
}