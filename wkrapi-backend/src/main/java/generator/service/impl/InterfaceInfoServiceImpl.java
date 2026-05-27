package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wkr.project.model.entity.InterfaceInfo;
import generator.service.InterfaceInfoService;
import com.wkr.project.mapper.InterfaceInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author Wkr21
* @description 针对表【interface_info(接口信息)】的数据库操作Service实现
* @createDate 2026-05-26 18:15:16
*/
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService{

}




