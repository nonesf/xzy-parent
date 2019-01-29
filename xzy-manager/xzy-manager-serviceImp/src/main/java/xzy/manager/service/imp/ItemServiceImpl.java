package xzy.manager.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xzy.manager.mapper.TbItemMapper;
import xzy.manager.pojo.TbItem;
import xzy.manager.service.ItemService;
@Service
public class ItemServiceImpl implements ItemService {

    //service 层依赖dao层
    @Autowired
   private TbItemMapper tbItemMapper;

    @Override
    public TbItem getItemById(long id) {
        TbItem tbItem=tbItemMapper.selectByPrimaryKey(id);
        return tbItem;
    }
}
