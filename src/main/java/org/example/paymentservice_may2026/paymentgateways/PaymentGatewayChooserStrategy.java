package org.example.paymentservice_may2026.paymentgateways;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentGatewayChooserStrategy {

    @Autowired
    private RazorpayPaymentGateway razorpayPaymentGateway;

    @Autowired
    private StripePaymentGateway stripePaymentGateway;

    public IPaymentGateway getBestPaymentGateway() {
        // call metrics service and get metrics of last 2 hours for each PG and
        // then accordingly return PG
        return stripePaymentGateway;
    }
}
