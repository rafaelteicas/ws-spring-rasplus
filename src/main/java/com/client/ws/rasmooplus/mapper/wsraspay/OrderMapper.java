package com.client.ws.rasmooplus.mapper.wsraspay;

import com.client.ws.rasmooplus.dto.PaymentProcessDto;
import com.client.ws.rasmooplus.dto.wsraspay.OrderDto;

public class OrderMapper {
    public static OrderDto build(String customerId, PaymentProcessDto dto) {
        return OrderDto.builder()
                .customerId(customerId)
                .productAcronym(dto.getProductKey())
                .discount(dto.getDiscount())
                .build();
    }
}
