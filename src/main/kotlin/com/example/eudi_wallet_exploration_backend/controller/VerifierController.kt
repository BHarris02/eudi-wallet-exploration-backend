package com.example.eudi_wallet_exploration_backend.controller

import org.springframework.web.bind.annotation.RestController

/**
 * A `RestController` exposing two endpoints:
 *
 * - `GET /request-presentation` &mdash; delegates to `VerifierService` to generate an authorisation request URI and
 * store its nonce in `NonceStore`
 * - `POST /presentation-response` &mdash; receives the Wallet's VP token, delegates to `VerifierService` for
 * validation, and returns a success or error response
 */
@RestController
class VerifierController {
}