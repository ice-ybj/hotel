package org.spring.springboot.service;

import org.spring.springboot.domain.OrderCheck;

import java.util.List;

public interface OrderCheckService {
    /**
     * 增加订单信息
     */
    public String addOrderCheck(OrderCheck orderCheck);

    /**
     * 删除订单信息
     */
    public String deleteOrderCheck(Long vip);

    /**
     * 根据订单号查找订单信息
     */
    public OrderCheck findOrderCheckByOCIN(Long ocin);

    /**
     * 查找所有订单信息
     */
    public List<OrderCheck> findAllOrderCheck();

    /**
     * 修改订单信息
     */
    public String modifyOrderCheck(OrderCheck orderCheck);
}
