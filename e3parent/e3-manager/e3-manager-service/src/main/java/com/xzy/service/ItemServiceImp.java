package com.xzy.service;

import com.xzy.mapper.TbItemMapper;
import com.xzy.pojo.TbItem;
import com.xzy.serviceInterface.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @auther zhouli
 * e-mail  ggwmmd@163.com
 * @since 2018/12/17 21:13
 */
@Service
public class ItemServiceImp implements ItemService {
    @Autowired
   private TbItemMapper itemMapper;

    @Override
    public TbItem selectById(Long id) {
       return this.itemMapper.selectByPrimaryKey(id);
    }
}
