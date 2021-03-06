package com.develop.jina1.product.productCharacteristic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProdCharValueDto {
    private Long id;
    private String value;
    private Long categoryCharacteristicValueId;
}
