package org.spring.springboot.dao;



import org.spring.springboot.domain.Good;
import org.spring.springboot.domain.OrderSales;

import java.util.List;

public interface GoodDao {
    /**
     * 查询所有商品信息
     */
    public List<Good> findAllGood();

    /**
     * 删除商品信息
     */
    public Long deleteGood(Long gin);

    /**
     * 修改商品信息
     */
    public Long modifyGood(Good good);

    /**
     * 添加商品信息
     */
    public Long addGood(Good good);

    /**
     * 根据商品号查询商品信息
     */
    public Good findGoodByGIN(Long gin);

    /**
     * 展示销售单信息
     */
    public List<OrderSales> findAllOrderSales();

    /**
     * 添加销售订单
     */
    public Long addSales(OrderSales orderSales);
}
