package com.study.it.service.impl;

import com.study.it.entity.Demo;
import com.study.it.mapper.DemoMapper;
import com.study.it.service.DemoService;
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
public class DemoServiceImpl extends ServiceImpl<DemoMapper, Demo> implements DemoService {

}
