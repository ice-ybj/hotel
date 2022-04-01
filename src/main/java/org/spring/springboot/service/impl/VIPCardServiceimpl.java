package org.spring.springboot.service.impl;

import org.spring.springboot.dao.VIPCardDao;
import org.spring.springboot.domain.VIPCard;
import org.spring.springboot.service.VIPCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VIPCardServiceimpl implements VIPCardService {
    @Autowired
    private VIPCardDao vipCardDao;

    @Override
    public String addVIP(VIPCard vipCard) {
        vipCardDao.addVIP(vipCard);
        return "添加成功";
    }

    @Override
    public String deleteVIP(Long vip) {
        Long flag = vipCardDao.deleteVIP(vip);
        if(flag==1) return "删除成功！";
        return "delete error";
    }

    @Override
    public VIPCard findVIPByVIP(Long vip) {
        return vipCardDao.findVIPByVIP(vip);
    }

    @Override
    public List<VIPCard> findAllVIP() {
        return vipCardDao.findAllVIP();
    }

    @Override
    public String modifyVIP(VIPCard vipCard) {
        Long flag = vipCardDao.modifyVIP(vipCard);
        System.out.println(flag);
        if(flag==1) return "修改成功！";
        return "modify error";
    }
}
