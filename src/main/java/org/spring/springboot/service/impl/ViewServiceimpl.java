package org.spring.springboot.service.impl;

import org.spring.springboot.dao.ViewDao;
import org.spring.springboot.service.ViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViewServiceimpl implements ViewService {
    @Autowired
    private ViewDao viewDao;

    @Override
    public Double findroomRevenueToday() {
        return viewDao.findroomRevenueToday();
    }

    @Override
    public Double findroomRevenueYesterday() {
        return viewDao.findroomRevenueYesterday();
    }

    @Override
    public Double findroomRevenue() {
        return viewDao.findroomRevenue();
    }

    @Override
    public Double findroomRevenueMonth() {
        return viewDao.findroomRevenueMonth();
    }

    @Override
    public Double findsaleRevenueToday() {
        return viewDao.findsaleRevenueToday();
    }

    @Override
    public Double findsaleRevenueYesterday() {
        return viewDao.findsaleRevenueYesterday();
    }

    @Override
    public Double findsaleRevenueMonth() {
        return viewDao.findsaleRevenueMonth();
    }

    @Override
    public Double findsaleRevenue() {
        return viewDao.findsaleRevenue();
    }

    @Override
    public Double findsaleExpenseMonth() {
        return viewDao.findsaleExpenseMonth();
    }

    @Override
    public Double findsaleExpense() {
        return viewDao.findsaleExpense();
    }
}
