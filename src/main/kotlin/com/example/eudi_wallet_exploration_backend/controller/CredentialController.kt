package com.example.eudi_wallet_exploration_backend.controller

import org.springframework.web.bind.annotation.RestController

/**
 * A `@RestController` exposing `POST /credential`.
 *
 * Validates the `Authorization: Bearer` header, then delegate to `CredentialService` to build and sign the SD-JWT
 * credential. Returns a `CredentialResponse` containing the signed JWT string.
 */
@RestController
class CredentialController {
}