package org.spring.springboot.service;

import org.spring.springboot.domain.OrderBook;

import java.util.List;

public interface OrderBookService {
    /**
     * 增加预订单信息
     */
    public String addOrderBook(OrderBook orderBook);

    /**
     * 删除预订单信息
     */
    public String deleteOrderBook(Long obin);

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
    public String modifyOrderBook(OrderBook orderBook);

    /**
     *查询库存
     */
    public int findamountByRoomTypeTitle(String roomtypetitle);
}
