package com.secondmarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.websocket.Encoder;

/**
 * @author peace
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods {

    // 商品id
    private Integer goodsId;
    // 类别id
    private Integer categoryId;
    // 商家id，用于标志该商品属于哪个商家，用于后续购买和店铺商品管理
    private Integer businessId;
    // 商品名称
    private String goodsName;
    // 商品图片
    private Encoder.Binary  goodsPicture;
    // 商品价格
    private Double goodsPrice;
    // 商品数量，默认为0
    private Integer goodsNumber;
    // 商品折扣，默认为 1，即无折扣
    private Integer goodsDiscount = 1 ;
    // 商品状态，分为4个状态，"审核中","正常","未通过","下架"
    private String goodsState;

}
