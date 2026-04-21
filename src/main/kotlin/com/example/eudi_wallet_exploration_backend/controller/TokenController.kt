package com.example.eudi_wallet_exploration_backend.controller

import org.springframework.web.bind.annotation.RestController

/**
 * A `@RestController` exposing `POST /token`.
 *
 * Accepts a form-encoded body containing the `pre-authorized_code` and `grant_type`. Delegates to `TokenService` to
 * validate the code and generate an access token and `c_nonce`. Returns a `TokenResponse`.
 */
@RestController
class TokenController {
}