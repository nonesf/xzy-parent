package xzy.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xzy.manager.pojo.TbItem;
import xzy.manager.service.ItemService;

@Controller
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/{itemId}")
    @ResponseBody
    public TbItem getItemById(@PathVariable Long itemId){
        TbItem TbItem=itemService.getItemById(itemId);
        return TbItem;

    }
}
