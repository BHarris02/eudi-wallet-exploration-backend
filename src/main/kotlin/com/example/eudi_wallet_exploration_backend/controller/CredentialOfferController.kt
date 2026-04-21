package com.example.eudi_wallet_exploration_backend.controller

import org.springframework.web.bind.annotation.RestController

/**
 * A `@RestController` exposing `GET /credential-offer`.
 *
 * Calls `IssuerService` to generate a one-time pre-authorised code, stores it in `TokenStore`, and returns the
 * credential offer URI as a plain string. In a real implementation this would generate a QR code.
 */
@RestController
class CredentialOfferController {
}