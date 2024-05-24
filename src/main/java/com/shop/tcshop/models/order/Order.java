package com.shop.tcshop.models.order;

import com.shop.tcshop.models.goods.Goods;

import java.util.List;

/**
 * 订单信息
 *
 * @author honggang.liu
 * @author honggang.liu
 */
public class Order {
    private Integer status;
    private String orderNo;
    private Long totalPrice;
    private List<Goods> goodsList;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }
}
