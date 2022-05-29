package com.study.it.service.impl;

import com.study.it.entity.Book;
import com.study.it.mapper.BookMapper;
import com.study.it.service.BookService;
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
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {

}
