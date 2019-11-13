package com.itrip.dao.Linkuser;

import com.itrip.beans.pojo.Linkuser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LinkuserMapper {

    List<Linkuser>getLinkuserBylinkUserName(@Param("linkUserName") String linkUserName,
                                            @Param("from") int from,
                                            @Param("pageSize") int pageSize);
    int getLinkuserBylinkUserNameCount(@Param("linkUserName") String linkUserName);
}
