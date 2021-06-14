package com.secondmarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author peace
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comments {

    //  订单id
    private Integer orderId;
    // 评分
    private Integer score;
    // 评论内容
    private String content;

}
