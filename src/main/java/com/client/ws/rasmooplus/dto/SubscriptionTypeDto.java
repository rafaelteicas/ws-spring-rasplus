package com.client.ws.rasmooplus.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SubscriptionTypeDto {
    private Long id;

    @Size(min = 5, max = 30)
    @NotBlank
    private String name;

    @Max(value = 12)
    private String accessMonths;

    @NotBlank
    private String price;

    @Size(min = 5, max = 15)
    @NotBlank
    private String productKey;
}
