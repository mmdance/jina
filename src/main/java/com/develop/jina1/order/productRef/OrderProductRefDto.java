package com.develop.jina1.order.productRef;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderProductRefDto {
    private Long orderId;
    private Long productId;
    private Integer quantity;
}
