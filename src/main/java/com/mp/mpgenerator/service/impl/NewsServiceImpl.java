package com.mp.mpgenerator.service.impl;

import com.mp.mpgenerator.entity.News;
import com.mp.mpgenerator.mapper.NewsMapper;
import com.mp.mpgenerator.service.NewsService;
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
public class NewsServiceImpl extends ServiceImpl<NewsMapper, News> implements NewsService {

}
