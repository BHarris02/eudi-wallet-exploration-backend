package com.example.eudi_wallet_exploration_backend.service

import org.springframework.stereotype.Service

/**
 * Responsible for the token exchange step. Validates that the `pre-authorised_code` exists in `TokenStore`, generates
 * an opaque access token (UUID), generates a c_nonce (UUID), stores both, and returns a `TokenResponse`. Invalidates
 * the pre-authorised code after use so it cannot be reused.
 */
@Service
class TokenService {
}