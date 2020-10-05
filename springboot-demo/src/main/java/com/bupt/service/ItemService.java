package com.bupt.service;

import com.bupt.pojo.Item;

import java.util.List;

public interface ItemService {
    public int add(Item item);
    public int delete(int id);
    public int update(Item item);
    public Item get(int id);
    public Item getWithName(String name);
    public List<Item> find(String name);
    public List<Item> list();
}
