package com.study.it.service.impl;

import com.study.it.entity.Admin;
import com.study.it.mapper.AdminMapper;
import com.study.it.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author CQW
 * @since 2022-05-29
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

}
