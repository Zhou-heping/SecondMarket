package com.secondmarket.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author peace
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
//    orderId int primary key auto_increment,   -- 订单id，数据库自增
//    id int,                                   -- 用户id，即购买人，外键
//    goodsId int,                              -- 商品id,外键
//    orderTime date ,                          -- 下单时间
//    orderCompleteTime  date ,                 -- 订单完成时间
//    goodsNumber int default 1,                -- 购买数量
//    orderState varchar(5) not null,           -- 订单状态，1.在购物车中，2. 进行中 3. 已完成 4. 已取消
    // 订单id，数据库自增
    private Integer orderId;
    // 用户id，即购买人，外键
    private Integer id;
    // 商品id,外键
    private Integer goodsId;
    // 下单时间
    private Date orderTime;
    // 订单完成时间
    private Date orderCompleteTime;
    // 购买数量
    private Integer goodsNumber;
    // 订单状态，1.在购物车中，2. 进行中 3. 已完成 4. 已取消
    private  String orderState;

}
