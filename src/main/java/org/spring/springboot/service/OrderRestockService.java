package org.spring.springboot.service;

import org.spring.springboot.domain.OrderRestock;

import java.util.List;

public interface OrderRestockService {
    /**
     * 查询所有商品进货信息
     */
    public List<OrderRestock> findAllOrderRestock();

    /**
     * 删除商品进货信息
     */
    public String deleteOrderRestock(Long orin);

    /**
     * 修改商品进货信息
     */
    public String modifyOrderRestock(OrderRestock orderRestock);

    /**
     * 添加商品进货信息
     */
    public String addOrderRestock(OrderRestock orderRestock);

    /**
     * 根据进货号查询商品信息
     */
    public OrderRestock findOrderRestockByORIN(Long orin);
}
