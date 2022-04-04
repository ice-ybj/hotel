package org.spring.springboot.service.impl;

import org.spring.springboot.dao.GoodDao;
import org.spring.springboot.domain.Good;
import org.spring.springboot.domain.OrderSales;
import org.spring.springboot.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodServiceimpl implements GoodService {
    @Autowired
    private GoodDao goodDao;


    @Override
    public List<Good> findAllGood() {
        return goodDao.findAllGood();
    }

    @Override
    public String deleteGood(Long gin) {
        Long flag = goodDao.deleteGood(gin);
        if(flag==1){return "删除成功！";}
        return "delete error!";
    }

    @Override
    public String modifyGood(Good good) {
        Long flag = goodDao.modifyGood(good);
        if(flag==1){return "修改成功！";}
        return "modify error!";
    }

    @Override
    public String addGood(Good good) {
        Long flag = goodDao.addGood(good);
        if(flag==1){return "添加成功！";}
        return "add error!";
    }

    @Override
    public Good findGoodByGIN(Long gin) {
        return goodDao.findGoodByGIN(gin);
    }

    @Override
    public List<OrderSales> findAllOrderSales() {
        return goodDao.findAllOrderSales();
    }
}
