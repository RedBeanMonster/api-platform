package com.wkr.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wkr.project.model.entity.InterfaceInfo;
import com.wkr.project.model.entity.Post;

/**
* @author Wkr21
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2026-05-26 18:12:54
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
