package com.study.it.service.impl;

import com.study.it.entity.Category;
import com.study.it.mapper.CategoryMapper;
import com.study.it.service.CategoryService;
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
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
