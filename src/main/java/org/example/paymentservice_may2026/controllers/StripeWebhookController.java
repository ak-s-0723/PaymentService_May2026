package org.example.paymentservice_may2026.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StripeWebhookController {

    @PostMapping("/stripeWebhook")
    public void respondToEvent(@RequestBody String event) {
        System.out.println(event);
    }
}
