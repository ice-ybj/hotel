package org.spring.springboot.service.impl;

import org.spring.springboot.dao.OrderBookDao;
import org.spring.springboot.domain.OrderBook;
import org.spring.springboot.service.OrderBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderBookServiceimpl implements OrderBookService {
    @Autowired
    private OrderBookDao orderBookDao;

    @Override
    public String addOrderBook(OrderBook orderBook) {
        orderBookDao.addOrderBook(orderBook);
        return "添加成功!";
    }

    @Override
    public String deleteOrderBook(Long obin) {
        Long flag = orderBookDao.deleteOrderBook(obin);
        if(flag==1) {return "删除成功!";}
        return "delete error！";
    }

    @Override
    public OrderBook findOrderBookByOBIN(Long obin) {
        return orderBookDao.findOrderBookByOBIN(obin);
    }

    @Override
    public List<OrderBook> findAllOrderBook() {
        return orderBookDao.findAllOrderBook();
    }

    @Override
    public String modifyOrderBook(OrderBook orderBook) {
        Long flag = orderBookDao.modifyOrderBook(orderBook);
        if(flag==1){return "修改成功！";}
        return "modify error!";
    }
}
