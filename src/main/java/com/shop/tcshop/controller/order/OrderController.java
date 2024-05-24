package com.shop.tcshop.controller.order;

import com.shop.tcshop.models.goods.Goods;
import com.shop.tcshop.models.order.Order;
import com.shop.tcshop.params.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 订单服务
 *
 * @author honggang.liu
 */
@RestController
@RequestMapping("/orders")
public class OrderController {

    @GetMapping("/getOrderList")
    public Result<List<Order>> getOrderList() {
        System.out.println("getOrderList");
        List<Goods> goodsList = new ArrayList<>();


        Order order1 = new Order();
        order1.setOrderNo("orderNo1");
        order1.setStatus(1);
        order1.setTotalPrice(100L);
        Goods goods1 = new Goods();
        goods1.setGoodsCount(1);
        goods1.setGoodsImageUrl("");
        goods1.setGoodsSku("sku1");
        goods1.setGoodsName("goodsName1");
        goods1.setGoodsPrice(100L);
        goodsList.add(goods1);

        Goods goods2 = new Goods();
        goods2.setGoodsCount(10);
        goods2.setGoodsImageUrl("");
        goods2.setGoodsSku("sku10");
        goods2.setGoodsName("goodsName10");
        goods2.setGoodsPrice(1000L);
        goodsList.add(goods2);

        Goods goods3 = new Goods();
        goods3.setGoodsCount(10);
        goods3.setGoodsImageUrl("");
        goods3.setGoodsSku("sku10");
        goods3.setGoodsName("goodsName10");
        goods3.setGoodsPrice(1000L);
        goodsList.add(goods3);

        order1.setGoodsList(goodsList);


        Order order2 = new Order();
        order2.setOrderNo("orderNo2");
        order2.setStatus(2);
        order2.setTotalPrice(1000L);
        order2.setGoodsList(goodsList);

        List<Order> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);

        return Result.ofSuccess(orders);
    }
}
