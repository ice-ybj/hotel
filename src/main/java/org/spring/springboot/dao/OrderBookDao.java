package org.spring.springboot.dao;



import org.spring.springboot.domain.OrderBook;

import java.util.List;

public interface OrderBookDao {
    /**
     * 增加预订单信息
     */
    public Long addOrderBook(OrderBook orderBook);

    /**
     * 删除预订单信息
     */
    public Long deleteOrderBook(Long obin);

    /**
     * 根据预订单号查找预订单信息
     */
    public OrderBook findOrderBookByOBIN(Long obin);

    /**
     * 查找所有预订单信息
     */
    public List<OrderBook> findAllOrderBook();

    /**
     * 修改预订单信息
     */
    public Long modifyOrderBook(OrderBook orderBook);

}
