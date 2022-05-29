package com.study.it.service.impl;

import com.study.it.entity.Message;
import com.study.it.mapper.MessageMapper;
import com.study.it.service.MessageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 留言表 服务实现类
 * </p>
 *
 * @author CQW
 * @since 2022-05-29
 */
@Service
public class MessageServiceImpl extends ServiceImpl<MessageMapper, Message> implements MessageService {

}
