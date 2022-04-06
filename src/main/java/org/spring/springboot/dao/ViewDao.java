package org.spring.springboot.dao;

public interface ViewDao {
    /**
     * 房间今日入住收入
     */
    public Double findroomRevenueToday();

    /**
     * 房间昨日入住收入
     */
    public Double findroomRevenueYesterday();

    /**
     * 房间全部入住收入
     */
    public Double findroomRevenue();

    /**
     * 房间本月入住收入
     */
    public Double findroomRevenueMonth();

    /**
     * 销售今日收入
     */
    public Double findsaleRevenueToday();

    /**
     * 销售昨日收入
     */
    public Double findsaleRevenueYesterday();

    /**
     * 销售本月收入
     */
    public Double findsaleRevenueMonth();

    /**
     * 销售全部收入
     */
    public Double findsaleRevenue();

    /**
     * 进货本月支出
     */
    public Double findsaleExpenseMonth();

    /**
     * 进货全部支出
     */
    public Double findsaleExpense();
}
