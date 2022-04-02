package org.spring.springboot.dao;

import com.sun.org.apache.xpath.internal.operations.Or;
import org.spring.springboot.domain.OrderCheck;
import org.spring.springboot.domain.VIPCard;

import java.util.List;

public interface OrderCheckDao {
    /**
     * 增加订单信息
     */
    public Long addOrderCheck(OrderCheck orderCheck);

    /**
     * 删除订单信息
     */
    public Long deleteOrderCheck(Long ocin);

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
    public Long modifyOrderCheck(OrderCheck orderCheck);
}
