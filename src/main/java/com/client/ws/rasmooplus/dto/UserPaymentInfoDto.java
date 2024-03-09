package com.client.ws.rasmooplus.dto;

import com.client.ws.rasmooplus.model.User;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPaymentInfoDto {
    private Long id;

    @Size(min = 16, max = 16)
    private String cardNumber;

    @Size(min = 1, max = 2)
    private Long cardExpirationMonth;

    private Long cardExpirationYear;

    @Size(min = 3, max = 3)
    private String cardSecurityCode;

    @NotNull
    private BigDecimal price;

    private LocalDate dtPayment = LocalDate.now();

    private Long installments;

    @NotNull
    private Long userId;
}
