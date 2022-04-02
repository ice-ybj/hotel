package org.spring.springboot.dao;

import org.spring.springboot.domain.VIPCard;

import java.util.List;

public interface VIPCardDao {
    /**
     * 增加VIP用户信息
     */
    public Long addVIP(VIPCard vipCard);

    /**
     * 删除VIP用户信息
     */
    public Long deleteVIP(Long vip);

    /**
     * 根据VIP卡号查找VIP用户信息
     */
    public VIPCard findVIPByVIP(Long vip);

    /**
     * 查找所有VIP用户信息
     */
    public List<VIPCard> findAllVIP();

    /**
     * 修改VIP用户信息
     */
    public Long modifyVIP(VIPCard vipCard);
}
