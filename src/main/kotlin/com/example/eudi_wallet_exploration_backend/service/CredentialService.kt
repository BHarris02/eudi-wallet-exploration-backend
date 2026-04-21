package com.example.eudi_wallet_exploration_backend.service

import org.springframework.stereotype.Service

/**
 * Responsible for building and signing the verifiable credential. Takes the access token (to look up the associated
 * session), constructs the JWT claims set (`name`, `age_over_18`, `iss`, `sub`, `iat`), anad calls `CryptoService`
 * to produce a signed SD-JWT string. Returns a `CredentialResponse`.
 */
@Service
class CredentialService {
}