package com.ecom_proj.dream_shops.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CartItemDto {
    private Long itemId;
    private Integer quantity;
    private BigDecimal unitPrice;
    private ProductDto product;
}
