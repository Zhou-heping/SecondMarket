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
public class GoodsCategories {

    // 商品类别id，数据库自增
    private Integer categoryId;
    // 类别名称，如水果、家电等，可以默认，商家无法添加，可有管理员或者数据库预置
    private String categoryName;
}
