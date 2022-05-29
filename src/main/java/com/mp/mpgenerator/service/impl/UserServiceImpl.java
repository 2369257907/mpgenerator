package com.mp.mpgenerator.service.impl;

import com.mp.mpgenerator.entity.User;
import com.mp.mpgenerator.mapper.UserMapper;
import com.mp.mpgenerator.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2022-05-29
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
