package org.example.paymentservice_may2026.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InitiatePaymentRequestDto {
    Long amount;
    String orderId;
    String phoneNumber;
    String name;
}
