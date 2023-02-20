package com.manman.crm.service.impl;

import com.manman.crm.pojo.Staff;
import com.manman.crm.mapper.StaffMapper;
import com.manman.crm.service.StaffService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 员工表 服务实现类
 * </p>
 *
 * @author gaoziman
 * @since 2023-02-20
 */
@Service
public class StaffServiceImpl extends ServiceImpl<StaffMapper, Staff> implements StaffService {

}
