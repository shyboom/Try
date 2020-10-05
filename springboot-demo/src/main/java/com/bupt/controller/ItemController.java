package com.bupt.controller;

import com.bupt.pojo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ItemController {
    @Autowired
    public com.bupt.service.ItemService itemService;

    @RequestMapping(value = "/addItem", method = RequestMethod.POST)
    public String addItem(@RequestParam("name") String name) {
        Item newItem = new Item(name);
        if(itemService.add(newItem) == 1) {
            return name+" add!";
        } else {
            return "err!";
        }
    }

    @RequestMapping("/deleteItem/{id}")
    public int deleteItem(@PathVariable("id") Integer id) {
        return itemService.delete(id);
    }

    @RequestMapping(value = "/updateItem", method = RequestMethod.POST)
    public int updateItem(@RequestParam("id") Integer id, @RequestParam("name") String name) {
        return itemService.update(new Item(id, name));
    }

    @RequestMapping(value = "/getItem/{id}", method = RequestMethod.GET)
    public String getItem(@PathVariable("id") Integer id) {
        return itemService.get(id).toString();
    }
    @RequestMapping(value = "/getItemWithName/{name}", method = RequestMethod.GET)
    public String getItemWithName(@PathVariable("name") String name) {
    	return itemService.getWithName(name).toString();
    }
    @RequestMapping(value = "/find/{name}", method = RequestMethod.GET)
    public String find(@PathVariable("name") String name) {
    	return itemService.find(name).toString();
    }
    @RequestMapping("/listItem")
    public String listItem() {
        return itemService.list().toString();
    }

}
