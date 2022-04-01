package org.spring.springboot.service;

import org.spring.springboot.domain.VIPCard;

import java.util.List;

public interface VIPCardService {
    /**
     * 增加VIP用户信息
     */
    public String addVIP(VIPCard vipCard);

    /**
     * 删除VIP用户信息
     */
    public String deleteVIP(Long vip);

    /**
     * 查找VIP用户信息
     */
    public VIPCard findVIPByVIP(Long vip);

    /**
     * 查找所有VIP用户信息
     */
    public List<VIPCard> findAllVIP();

    /**
     * 修改VIP用户信息
     */
    public String modifyVIP(VIPCard vipCard);
}
