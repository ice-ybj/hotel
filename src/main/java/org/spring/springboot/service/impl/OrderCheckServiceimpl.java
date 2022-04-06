package org.spring.springboot.service.impl;

import org.spring.springboot.dao.OrderCheckDao;
import org.spring.springboot.domain.OrderCheck;
import org.spring.springboot.domain.RoomerRecord;
import org.spring.springboot.service.OrderCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderCheckServiceimpl implements OrderCheckService {
    @Autowired
    private OrderCheckDao orderCheckDao;

    @Override
    public String addOrderCheck(OrderCheck orderCheck) {
        orderCheckDao.addOrderCheck(orderCheck);
        return "添加成功!";
    }

    @Override
    public String deleteOrderCheck(Long ocin) {
        Long flag = orderCheckDao.deleteOrderCheck(ocin);
        if(flag==1) {return "删除成功!";}
        return "delete error！";
    }

    @Override
    public OrderCheck findOrderCheckByOCIN(Long ocin) {
        return orderCheckDao.findOrderCheckByOCIN(ocin);
    }

    @Override
    public List<OrderCheck> findAllOrderCheck() {
        return orderCheckDao.findAllOrderCheck();
    }

    @Override
    public String modifyOrderCheck(OrderCheck orderCheck) {
        Long flag = orderCheckDao.modifyOrderCheck(orderCheck);
        if(flag==1){return "修改成功！";}
        return "modify error!";
    }

    @Override
    public String addRoomer(RoomerRecord roomerRecord) {
        orderCheckDao.addRoomer(roomerRecord);
        return "添加成功!";
    }
}
