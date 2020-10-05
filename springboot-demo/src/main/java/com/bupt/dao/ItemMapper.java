package com.bupt.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;

import com.bupt.pojo.Item;

@Mapper
public interface ItemMapper {

    @Insert("insert into item (name) values (#{name})")
    int add(Item item);

    @Delete("delete from item where id = #{id}")
    int delete(int id);

    @Update("update item set name=#{name} where id = #{id}")
    int update(Item item);

    @Select("select * from item where id = #{id}")
    Item get(int id);
    
    @Select("select * from item where name = #{name}")
    Item getWithName(String name);
    
    List<Item> find(String name);

    List<Item> list();

}
