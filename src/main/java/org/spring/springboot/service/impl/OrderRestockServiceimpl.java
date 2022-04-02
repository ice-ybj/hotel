package org.spring.springboot.service.impl;

import org.spring.springboot.dao.OrderRestockDao;
import org.spring.springboot.domain.OrderRestock;
import org.spring.springboot.service.OrderRestockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderRestockServiceimpl implements OrderRestockService {
    @Autowired
    private OrderRestockDao orderRestockDao;

    @Override
    public List<OrderRestock> findAllOrderRestock() {
        return orderRestockDao.findAllOrderRestock();
    }

    @Override
    public String deleteOrderRestock(Long orin) {
        Long flag = orderRestockDao.deleteOrderRestock(orin);
        if(flag==1){return "删除成功！";}
        return "delete error";
    }

    @Override
    public String modifyOrderRestock(OrderRestock orderRestock) {
        Long flag = orderRestockDao.modifyOrderRestock(orderRestock);
        if(flag==1){return "修改成功！";}
        return "modify error";
    }

    @Override
    public String addOrderRestock(OrderRestock orderRestock) {
        Long flag = orderRestockDao.addOrderRestock(orderRestock);
        if(flag==1){return "添加成功！";}
        return "add error";
    }

    @Override
    public OrderRestock findOrderRestockByORIN(Long orin) {
        return orderRestockDao.findOrderRestockByORIN(orin);
    }
}
