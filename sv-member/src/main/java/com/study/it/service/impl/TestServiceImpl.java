package com.study.it.service.impl;

import com.study.it.entity.Test;
import com.study.it.mapper.TestMapper;
import com.study.it.service.TestService;
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
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements TestService {

}
