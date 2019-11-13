package com.itrip.biz.service;

import com.itrip.beans.pojo.Linkuser;
import com.itrip.utils.PagedData;

public interface LinkuserService {
    PagedData<Linkuser>getPageData(String linkUserName,int pageIndex,int pageSize);
}
