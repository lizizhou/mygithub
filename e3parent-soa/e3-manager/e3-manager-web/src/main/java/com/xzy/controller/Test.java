package com.xzy.controller;

import com.xzy.pojo.TbItem;
import com.xzy.serviceInterface.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @auther zhouli
 * e-mail  ggwmmd@163.com
 * @since 2018/12/17 21:13
 */
@Controller
public class Test {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/admin/{id}")
    @ResponseBody
    public TbItem demo(@PathVariable Long id){
        return  this.itemService.selectById(id);

    }
}
