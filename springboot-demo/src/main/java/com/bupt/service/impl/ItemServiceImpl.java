package com.bupt.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import com.bupt.dao.ItemMapper;
import com.bupt.pojo.Item;

@Service
public class ItemServiceImpl implements com.bupt.service.ItemService {
    @Resource
    public ItemMapper itemMapper;
// 子类重写父类方法
    @Override 
    public int add(Item item) {
        return itemMapper.add(item);
    }

    @Override
    public int delete(int id) {
        return itemMapper.delete(id);
    }

    @Override
    public int update(Item item) {
        return itemMapper.update(item);
    }

    @Override
    public Item get(int id) {
    	
        return itemMapper.get(id);

    }

    @Override
    public List<Item> list() {
        return itemMapper.list();
    }
    
    @Override
    public Item getWithName(String name) {
    	return itemMapper.getWithName(name);
    }
    
    @Override
    public List<Item> find(String name) {
    	return itemMapper.find(name);
    }


}
